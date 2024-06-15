import java.util.Scanner;
public class No2GetInputFromTheUser {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 , num2;
        String name;
        System.out.print("Enter name: ");
        name = scn.nextLine();
        System.out.print("Enter 1st number: ");
        num1 = scn.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = scn.nextInt();

        System.out.println("Name: " + name);
        System.out.println("1st number: " + num1);
        System.out.println("2nd number: " + num2);


    }
}
