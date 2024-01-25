import java.util.Scanner;

class App {

  public static void main(String args[]) {
    System.out.println("hello world");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a = sc.nextInt();

    System.out.println("Enter the second number:");
    int b = sc.nextInt();

    System.out.println("Before Swapping: " + a + " " + b);

    int temp = a;
    a = b;
    b = temp;

    System.out.println("After Swapping: " + a + " " + b);
  }
}
