import java.util.Scanner;
public class No3ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1, num2;
        int result;
        System.out.print("Enter 1st number: ");
        num1= scn.nextInt();
        System.out.print("Enter 2nd number: ");
        num2= scn.nextInt();

        result = num1 + num2;
        System.out.println("Sum: "+result);

        result = num1 - num2;
        System.out.println("Subordination: "+ result);

        result = num1 * num2;
        System.out.println("Multiplication: "+ result);

        result = num1 / num2;
        System.out.println("Divetion: "+ result);

        result = num1 % num2;
        System.out.println("Reminder: "+ result);



    }
}
