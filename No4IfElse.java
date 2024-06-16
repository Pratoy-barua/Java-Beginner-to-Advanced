import java.util.Scanner;
public class No4IfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.print("Enter any number: ");
        num = scn.nextInt();

        if(num == 0)
        {
            System.out.println("Number is Zero");
        }
        else if (num%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }

}
