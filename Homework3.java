import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Question 1
        System.out.println("************Question 1************");
        for (int i = 1; i <=100 ; i++) {
            if(i%3 == 0 && i%5 ==0){
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            }
        }

        // Question 2
        System.out.println("\n************Question 2************\n");
        System.out.println("Enter a string to reverse it : ");
        String regString = input.nextLine();
        String revString="";
        for(int i=(regString.length()-1); i>=0; i--){
            revString += regString.charAt(i);
        }
        System.out.println(revString);

        // Question 3
        System.out.println("\n************Question 3************\n");
        System.out.println("Enter a number for it's multiplication table : ");
        int num = input.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i+" * "+ num + " = "+ (num*i));
        }

        // Question 4
        System.out.println("\n************Question 4************\n");
        System.out.println("Enter a number to finds it's factorial : ");
        num = input.nextInt();
        int resultOfFactorial=1;
        for (int i = num; i >=1 ; i--) {
            resultOfFactorial*=num--;

        }
        System.out.println(resultOfFactorial);

        // Question 5
        System.out.println("\n************Question 5************\n");
        System.out.println("Enter the base number : ");
        int base = input.nextInt();
        System.out.println("Enter the power number : ");
        int power = input.nextInt();
        int resultOfPower = 1;
        for (int i = 0; i < power ; i++) {
            resultOfPower *= base;
        }
        System.out.println(resultOfPower);

        // Question 6
        System.out.println("\n************Question 6************\n");
        System.out.println("Enter a set of numbers, and for(Exit write -1)");
        num = input.nextInt();
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for(; num != -1 ;){ // we can

            if(num % 2 ==0){
                sumOfEven+=num;
            }else {
                sumOfOdd+=num;
            }
            System.out.println("Enter a set of numbers, and for(Exit write -1) : ");
            num = input.nextInt();
        }
        System.out.println("The sum of even numbers is = "+ sumOfEven+"\nThe sum of odd numbers is = "+sumOfOdd);

        // Question 7
        System.out.println("\n************Question 7************\n");
        System.out.println("Enter a number to finds out if it's a prime or NOT : ");

        num = input.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <num ; i++) {
            if(num%i == 0){
                System.out.println("The ( "+num+" ) is NOT a prime number!");
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            System.out.println("The ( "+num+" ) is a prime number ");
        }

        // Question 8
        System.out.println("\n************Question 8************\n");
        num = 0;
        int positiveNumbers =0, negativeNumbers=0, zeros= 0;
        while(true) {
            System.out.println("Enter a set of numbers, and for(Exit write -1) : ");
            num = input.nextInt();
            if(num == -1){
                break;
            }

            if(num > 0){
                positiveNumbers++;
            }else if(num < 0){
                negativeNumbers++;
            }else{
                zeros++;
            }
        }
        System.out.println("The positive numbers is : "+ positiveNumbers+"\nThe negative numbers is "+negativeNumbers+"\nThe zeros is : "+zeros);
        input.nextLine();// this line because nextInt() reads an integer but does not read the escape sequence "\n", so this line will read the empty line.
        // Question 9

        System.out.println("\n************Question 9************\n");

        for (int i = 1; i <=4 ; i++) {
            System.out.println("****Week"+ i +"****");
            for (int j = 1; j <=7 ; j++) {
                System.out.println("Day "+ j);
            }
        }

        // Question 10

        System.out.println("\n************Question 10************\n");
        System.out.println("Enter a word to test it if it's palindrome");
        String word = input.nextLine();
        int startIndex=0;
        boolean isPalindrome = true;
        for (int i = (word.length()-1); i >=0 ; i--) {   //
            if (word.charAt(startIndex) == word.charAt(i)){
                startIndex++;
            }else{
                isPalindrome  = false;
                System.out.println("This word \"" + word + "\" is NOT a palindrome  ");
                break;
            }
        }
        if(isPalindrome == true) {
            System.out.println("This word \"" + word + "\" is a palindrome  ");
        }

    }
}