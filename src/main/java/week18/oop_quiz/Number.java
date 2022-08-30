package week18.oop_quiz;

public class Number {
  int num1 = 6;
  static int num2 = 10;

  public static void main(String[] args) {
    Number s1 = new Number();
    Number s2 = new Number();

    s1.num1 = 15;//s1.num1 = 15
    s1.num2 = 17;//num2 = 17

    s2.num1 = 22;//s2.num1 = 22
    s2.num2 = 28;//num2 = 28

    //                   15             28                 23               30
    //System.out.println(s1.num1 + "" + s1.num2++ + "" + ++s2.num1 + "" + ++s2.num2);

    //              last assigned : 15
    System.out.println(s1.num1 + "" +
                                    //last assigned: 28, it will increase by 1 after this expression (29 for further processes)
                                      s1.num2++ + "" +
                                                      //last assigned: 22, but, bec of ++ it is processed as 23
                                                      ++s2.num1 + "" +
                                                                        //it was 29 before this expression (look at line 22), but, bec of ++ it is processed as 30
                                                                        ++s2.num2);
  }
}
