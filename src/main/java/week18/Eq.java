package week18;

public class Eq {
  public String variable;

  public Eq(String variable){
    this.variable = variable;
  }

  public static void main(String[] args) {

    String helloLiteral = "Hello";
    String helloNew = new String("Hello");

    System.out.println(helloLiteral == helloNew);
    System.out.println(helloLiteral.equals(helloNew));

    Eq obj1 = new Eq("obj1");
    Eq obj2 = new Eq("obj1");

    System.out.println(obj1 == obj2);

    Eq obj3 = obj1;
    System.out.println(obj1 == obj3);
  }

}
