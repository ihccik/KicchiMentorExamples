package week9;

/**
 * Write a code that throws NullPointerException
 */
public class Exception_NullPointerException {

  public static void main(String[] args) {
    Dog myDog = null;
    System.out.println(myDog.name);
  }

}

class Dog{
  String name;

  public Dog(String nameOfTheDog){
    name = nameOfTheDog;
  }
}
