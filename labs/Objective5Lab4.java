import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
    System.out.println("Please enter a number.");
    num = scanner.nextInt();

    if(num % 2 == 0){
      System.out.println(num + " is even");
    }
    if (num % 2 != 0){
      System.out.println(num + " is odd");
    }
    scanner.close();
    //end
  }
}
