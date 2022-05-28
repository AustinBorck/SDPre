import java.util.Scanner;

public class Objective9Lab5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;

    System.out.println("Please enter a number: ");
    num1 = kb.nextDouble();
    System.out.println("Please enter another number: ");
    num2 = kb.nextDouble();

    while (keepGoing) {
      printMenu();
      System.out.println("Which would you like to do?");
      choice = kb.nextInt();

      switch (choice) {
        case 1: findSum(num1, num2);
        break;

        case 2: findAverage(num1, num2);
        break;

        case 3: calcTax(num1, num2);
        break;

        case 4:
        System.out.println("Goodbye");
        return;

        default:
        System.out.println("That is not a valid choice.");
        break;

      } //choice end



    }//while end



  }//main end
  public static void printMenu() {
  		System.out.println();
  		System.out.println("========= MENU =========");
  		System.out.println("|                      |");
  		System.out.println("|   1. Add Numbers     |");
  		System.out.println("|   2. Find Average    |");
  		System.out.println("|   3. Calculate Tax   |");
  		System.out.println("|   4. Exit            |");
  		System.out.println("|                      |");
  		System.out.println("========================");
  		System.out.println();
  	}//printMenu end

public static double findSum(double x, double y) {
double sum = x + y;
System.out.println(x + " + " + y + " = " + sum);
return sum;

}//findSum end

public static double findAverage(double x, double y) {
  double sum = x + y;
  double average = sum / 2;
  System.out.println("The average of " + x + " and " + y + " is " + average);
  return average;
}//findAverage end

public static double calcTax(double x, double y){
double sum = x + y;
double tax = sum * .0831;
System.out.println("The ammount in tax to be collected from a purchase of " + x + " and " + y + " is " + tax);
return tax;
}//calcTax end


}//class end
