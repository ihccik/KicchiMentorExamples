package experimental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exp6 {

  public static void main(String[] args) throws ParseException {
    Scanner input = new Scanner(System.in);

    System.out.println("Select screen size:");
    double size = input.nextDouble();//used String for 1st solution with switch
    input.nextLine();////used String for 1st solution (switch)

    System.out.println("Select CPU type:");
    String cpu = input.nextLine();

    System.out.println("Select RAM size:");
    int ram = input.nextInt();
    input.nextLine();

    System.out.println("Select storage type:");
    String stType = input.nextLine();

    System.out.println("Select storage size:");
    double stSize = input.nextDouble();
    input.nextLine();

    System.out.println("Select screen resolution:");
    String resolution = input.nextLine();

    int ramPrice = (ram/4)*50;
    double total=ramPrice;

    if(size==13.3){total+=200;}
    else if(size==15.0){total+=300;}
    else{total+=400;}
    //CPU
    if(cpu.equalsIgnoreCase("i3")){total+=150;}
    else if(cpu.equalsIgnoreCase("i5")){total+=250;}
    else{total+=350;}
    //Storage Type
    if(stType.equalsIgnoreCase("HDD")){total+=(stSize/500)*50;}
    else{total+=(stSize/500)*100;}
    //Resolution
    if(resolution.equalsIgnoreCase("fullhd")){total+=100;}
    else{total+=200;}

    System.out.println("Final price is: $" + total);
  }
}
