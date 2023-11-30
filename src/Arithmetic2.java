import java.util.Scanner;

public class Arithmetic2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter first number: ");
        int number1 = input.nextInt();

        System.out.print("enter second number: ");
        int number2 = input.nextInt();

        System.out.print("enter third number: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int average = sum / 3;
        int product = number1 * number2 * number3;
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);

        System.out.println("sum is: " + sum);
        System.out.println("average is: "+ average);
        System.out.println("product is: " + product);
        System.out.println("smallest is: " + smallest);
        System.out.println("largest is: " + largest);


    }
}
