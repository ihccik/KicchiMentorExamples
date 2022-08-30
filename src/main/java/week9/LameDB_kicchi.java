package week9;

import java.util.Scanner;

class LameDB_kicchi {

  public static String lameDb(String db, String op, String id, String data) {


    String[] items = db.split("#");

    if (op.equals("add"))
    {
      int indexToAdd = Integer.parseInt(id) - 1;
      String[] newItems = new String[items.length + 1];
      int counter = 0;

      for(int i = 0; i < items.length + 1; i++)
      {
        if (counter == indexToAdd)
        {
          newItems[counter] = "#"+(indexToAdd+1)+data;
          i--;
        }
        else if (i < items.length)
          newItems[counter] = "#"+ (counter+1) + items[i].substring(1);

        counter++;
      }

      String ret = "";
      for(int i=0; i<newItems.length;i++) {
        ret += newItems[i];
      }
      if (ret.substring(1,2).equals("1"))
        ret = ret.substring(1);

      return ret;
    }
    else
    {

      if (op.equals("edit")){


        for(int i=0; i<items.length;i++) {
          if (Integer.parseInt(id) - 1 == i)
            items[i] = "#"+id+data;
          else
            items[i] = "#"+items[i];
        }

      }
      else if (op.equals("delete")){
        String[] newItems = new String[items.length - 1];
        int counter = 0;
        int idToRemove = Integer.parseInt(id);
        for(int i = 0; i < items.length; i++)
        {
          if (i != idToRemove - 1) {
            newItems[counter] = "#" + items[i];
            counter++;
          }
        }
        items = newItems;
      }


      String ret = "";
      for(int i=0; i<items.length;i++) {
        ret += items[i];
      }

      if (ret.substring(1,2).equals("1"))
        ret = ret.substring(1);

      return ret;

    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

  }

}