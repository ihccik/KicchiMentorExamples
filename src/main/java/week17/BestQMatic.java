package week17;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Queue;

public class BestQMatic {

  public static void main(String[] args) {
    LinkedHashMap<String, ArrayList<Integer>> desks = new LinkedHashMap<>();

    desks.put("Desk 1", new ArrayList<>());
    desks.put("Desk 2", new ArrayList<>());
    desks.put("Desk 3", new ArrayList<>());

    System.out.println(desks);

    Queue<Client> clients = new ArrayDeque<>();
    clients.add(new Client("Drogba", 'A'));
    clients.add(new Client("Cantona", 'A'));
    clients.add(new Client("Ronaldinho", 'B'));
    clients.add(new Client("Zidane", 'C'));
    clients.add(new Client("Cruyff", 'D'));
    clients.add(new Client("Ronaldo", 'B'));
    clients.add(new Client("Baggio", 'C'));

    System.out.println(Arrays.toString(findLastClientDeskAndWaitTime(desks, clients)));
  }

  public static String[] findLastClientDeskAndWaitTime(LinkedHashMap<String, ArrayList<Integer>> desks, Queue<Client> clients){
    String lowestTimedDesk = "";

    while (!clients.isEmpty()){
      Client currentClient = clients.remove();

      int lowestTime = Integer.MAX_VALUE;

      for (Entry<String, ArrayList<Integer>> desk : desks.entrySet()) {
        int currentDeskTotalTime = desk.getValue().stream().mapToInt(Integer::intValue).sum();
        if (currentDeskTotalTime < lowestTime){
          lowestTimedDesk = desk.getKey();
          lowestTime = currentDeskTotalTime;
        }
      }

      desks.get(lowestTimedDesk).add(getProcessTimeByProcessType(currentClient.getProcessType()));
    }

    int totalWaitTimeForLastClient = 0;
    for (int i = 0; i < desks.get(lowestTimedDesk).size() - 1; i++) {
      totalWaitTimeForLastClient += desks.get(lowestTimedDesk).get(i);
    }
    return new String[]{lowestTimedDesk, String.valueOf(totalWaitTimeForLastClient)};
  }

  public static int getProcessTimeByProcessType(char processType){
    switch (processType){
      case 'A':
        return 5;
      case 'B':
        return 3;
      case 'C':
        return 7;
      case 'D':
        return 10;
      default:
        return -1;
    }
  }
}

class Client {
  private String name;
  private char processTypeCode;

  public Client(String name, char processTypeCode) {
    this.name = name;
    this.processTypeCode = processTypeCode;
  }

  public String getName() {
    return name;
  }

  public char getProcessType() {
    return processTypeCode;
  }

  @Override
  public String toString() {
    return "Client{" +
        "name='" + name + '\'' +
        ", processTypeCode=" + processTypeCode +
        '}';
  }
}

