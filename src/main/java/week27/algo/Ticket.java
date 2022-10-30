package week27.algo;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ticket {

  public static void main(String[] args) {
    int[] tickets = null;
    int k = 0;

    tickets = new int[]{2,3,2};
    k = 2;
    System.out.println(timeRequiredToBuy3(tickets, k));

    tickets = new int[]{5, 1, 1, 1};
    k = 0;
    System.out.println(timeRequiredToBuy3(tickets, k));
  }

  //worst
  public static int timeRequiredToBuy1(int[] tickets, int k) {
    IntStream intStream = Arrays.stream(tickets);
    Queue<Integer> ticketQueue = intStream.boxed().collect(Collectors.toCollection(ArrayDeque::new));

    int totalTime = 0;
    int currentIndex = 0;
    while (!ticketQueue.isEmpty()) {

      if (ticketQueue.peek() != 0) {
        int currentTicketCount = ticketQueue.poll()-1;
        ticketQueue.add(currentTicketCount);
        totalTime++;
        if (currentIndex==k && currentTicketCount==0){
          break;
        }
      } else {
        ticketQueue.add(ticketQueue.poll());
      }

      currentIndex++;
      if (currentIndex == tickets.length) {
        currentIndex = 0;
      }
    }

    return totalTime;
  }

  //moderate
  public static int timeRequiredToBuy2(int[] tickets, int k) {
    int count=0;
    while(tickets[k]>0){
      for(int i=0;i<tickets.length;i++){
        if(tickets[i]>0){
          tickets[i]-=1;
          count++;
        }
        if(tickets[k]==0)break;
      }
    }
    return count;
  }

  //best
  public static int timeRequiredToBuy3(int[] tickets, int k) {
    int seconds = 0;
    for(int i = 0; i < tickets.length; i++){
      if(tickets[i] < tickets[k]) {
        seconds += tickets[i]; // only add the time needed to buy his tickets
      }
      else{
        if(i <= k) {
          seconds += tickets[k];
        }
        else {
          seconds += tickets[k] - 1;
        }
      }
    }
    return seconds;
  }

  public static int timeRequiredToBuy4(int[] tickets, int k) {
    Queue<Integer> q= new LinkedList<>();
    for(int i=0;i<tickets.length;i++)
    {
      q.add(i);
    }
    int count=0;
    while(!q.isEmpty())
    {
      ++count;
      int front=q.poll();
      if(tickets[front]>=1)
      {
        tickets[front]-=1;
      }
      if(k!=front && tickets[front]==0)
      {
        continue;
      }
      if(k==front && tickets[front]==0)
      {
        break;
      }
      q.add(front);

    }
    return count;
  }

  public static int timeRequiredToBuy6(int[] tickets, int k) {
    Queue<Integer> ticketQueue = Arrays.stream(tickets).boxed().collect(Collectors.toCollection(ArrayDeque::new));

    int totalTime = 0;
    while (!ticketQueue.isEmpty()) {

      for (int i = 0; i < ticketQueue.size(); i++) {
        int currentTicketCount = ticketQueue.poll()-1;
        totalTime++;
        if (currentTicketCount == 0){
          if (i == k){
            return totalTime;
          }
          else {
            if (i > k){
              //k = ticketQueue.size() - 1;
             // i--;
            }
            else{
              k--;
            }

          }
        }
        else {
          ticketQueue.add(currentTicketCount);
          if (k > 0){
            k--;
          }
          else if (k == 0){
            k = ticketQueue.size() - 1;
          }
        }
      }
    }

    return -1;
  }

  public static int timeRequiredToBuy7(int[] tickets, int k) {
    Queue<Integer> ticketQueue = Arrays.stream(tickets).boxed().collect(Collectors.toCollection(ArrayDeque::new));

    int totalTime = 0;
    while (!ticketQueue.isEmpty()) {

      int currentTicketCount = ticketQueue.poll()-1;
      totalTime++;
      int currentIndex = 0;
      if (currentTicketCount == 0){
        if (currentIndex == k){
          return totalTime;
        }
        else if (currentIndex < k){
          k--;
        }
      }
      else {
        ticketQueue.add(currentTicketCount);
        if (k > 0){
          k--;
        }
        else if (k == 0){
          k = ticketQueue.size() - 1;
        }
      }
    }

    return -1;
  }


  public static int timeRequiredToBuy8(int[] tickets, int k) {
    Queue<Integer> ticketQueue = Arrays.stream(tickets).boxed().collect(Collectors.toCollection(ArrayDeque::new));

    int totalTime = 0;
    while (!ticketQueue.isEmpty()) {

      int leftTicketCount = ticketQueue.poll()-1;
      totalTime++;

      if (leftTicketCount == 0){
        if (k == 0){
          return totalTime;
        }
        else if (k > 0){
          k--;
        }
      }
      else {
        ticketQueue.add(leftTicketCount);
        if (k > 0){
          k--;
        }
        else if (k == 0){
          k = ticketQueue.size() - 1;
        }
      }
    }

    return -1;
  }


}
