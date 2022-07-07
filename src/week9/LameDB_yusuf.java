package week9;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class LameDB_yusuf {
  public static String lameDb(String db, String op, String id, String data) {

    String[] db2 = db.split("#");

    String db3 = "";

    int id2 = parseInt(id);

    if (op.equals("add")){
      if (id2 <= db2.length) {
        if (id2 == 1){
          db3 = id + data;
          for (int i = 0, j = id2+1; i < db2.length; i++, j++) {
            db3 += "#"+ j + db2[i].substring(1);
          }
        }else {
          db3 = db2[0];
          for (int i = 1, j = id2+1; i < db2.length; i++ ) {
            if (i == id2 - 1) {
              db3 += "#" + id + data;
            }
            if (i < id2 -1){//this if can be else if
              db3 += "#" + db2[i];
            }else{
              db3 += "#"+ j + db2[i].substring(1);
              j++;
            }
          }
        }
        return db3;
      }else{
        return db +"#"+ id2 + data;
      }
    } else if (op.equals("edit")) {
      db2[id2-1] =id2 + data;
      db3 = "";
      for (String each : db2) {
        if (!each.equals(db2[0])) {//I did not understand this part
          db3 += "#" + each;
        }else db3 += each;
      }
      return db3;
    }else {
      db2[id2-1] = "";
      db3 = "";
      for (String each : db2) {
        if (each != db2[id2-1]){
          if (!each.equals(db2[0])) {//I did not understand this part
            db3 += "#" + each;
          }else db3 += each;
        }
      }
      return db3;
    }
  }//end lameDb

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

  }
}
