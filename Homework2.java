import java.util.Scanner;

/*
*   @author Faisal Alharbi
*/
public class Homework2 {
    public static void main(String[] args) {
        // Question 1
        Scanner input = new Scanner(System.in);
        System.out.println("************Question 1************");
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();

        System.out.println(num1 + " + "+ num2+" = "+(num1+num2));
        System.out.println(num1 + " - "+ num2+" = "+(num1-num2));
        System.out.println(num1 + " * "+ num2+" = "+(num1*num2));
        System.out.println(num1 + " / "+ num2+" = "+(num1/num2));
        System.out.println(num1 + " mod "+ num2+" = "+(num1%num2));

        input.nextLine(); // this line because nextInt() reads an integer but does not read the escape sequence "\n", so this line will read the empty line.

        // Question 2
        System.out.println("\n************Question 2************");
        System.out.println("Enter your sentence : ");
        String sentence = input.nextLine();

        System.out.println(sentence.toLowerCase());

        //Question 3
        System.out.println("\n************Question 3************");
        System.out.println("Enter a string : ");
        String s = input.nextLine();

        System.out.println("Enter the index, Note: it starts from Zero! ");
        int index = input.nextInt();

        System.out.println(s.charAt(index));

        // Question 4
        System.out.println("\n************Question 4************");
        System.out.println("Enter a number to check if it's even or odd : ");
        num1 = input.nextInt();

        if(num1 % 2 == 0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        input.nextLine();// this line because nextInt() reads an integer but does not read the escape sequence "\n", so this line will read the empty line.

        // Question 5
        System.out.println("\n************Question 5************");
        System.out.println("Enter your role : ");
        String role = input.nextLine();

        if(role.equalsIgnoreCase("admin")){
            System.out.println("welcome admin");
        }else if(role.equalsIgnoreCase("superuser")){
            System.out.println("welcome superuser");
        }else if(role.equalsIgnoreCase("user")){
            System.out.println("welcome user");
        }

        // Question 6
        System.out.println("\n************Question 6************");
        System.out.println("Enter the first number : ");
        num1 = input.nextInt();

        System.out.println("Enter the second number : ");
        num2 = input.nextInt();

        System.out.println("Enter the third number : ");
        int num3 = input.nextInt();

        if((num1 + num2) == num3){
            System.out.println("The result is : "+ true);
        }

        // Question 7
        System.out.println("\n************Question 7************");
        System.out.println("Enter the first number : ");
        num1 = input.nextInt();

        System.out.println("Enter the second number : ");
        num2 = input.nextInt();

        System.out.println("Enter the third number : ");
        num3 = input.nextInt();

        if(num1 > num2){

            if(num1 > num3){
                System.out.println("The greatest number is : "+ num1);
            }else {
                System.out.println("The greatest number is : "+ num3);
            }

        }else if(num2 > num3){
            System.out.println("The greatest number is : "+ num2);
        }else {
            System.out.println("The greatest number is : "+ num3);
        }


        // Question 8
        System.out.println("\n************Question 8************");
        System.out.println("Enter a number between 1 and 7 "); // number one means monday and so on.
        int numDay = input.nextInt();

        switch(numDay){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }


    }
}