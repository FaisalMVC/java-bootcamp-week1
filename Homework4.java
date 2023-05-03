/*
* @author Faisal Alharbi
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
    // Question 1
    System.out.println("************ Question 1 ************");
    int [] testData = {50, -20, 0, 30, 40, 60, 10};
    System.out.println(testData[0] == testData[(testData.length-1)]);

    // Question 2
        System.out.println("\n************ Question 2 ************\n");
    int [] findMax = {1, 4, 17, 7, 25, 3, 100};
    int k = 3; // number of largest numbers
        for(int i =0 ; i < findMax.length ; i++){
            for(int j =i+1; j<findMax.length; j++){
                if(findMax[i] > findMax[j]){
                    findMax[i] ^= findMax[j];
                    findMax[j] ^= findMax[i];
                    findMax[i] ^= findMax[j];
                }
            }
        }
        System.out.print("The "+k+" largest numbers are : ");
        for(int i = findMax.length-1 ; i >= findMax.length-k; i--){
            System.out.print(findMax[i]+" ");
        }
        System.out.println();

    // Question 3
        System.out.println("\n************ Question 3 ************\n");
    int [] findAverage  = {1, 4, 17, 7, 25, 3, 100};
    double average =0;
    for(int element: findAverage){
        average+= element;
    }
    average /= findAverage.length;
    ArrayList greaterThanAverage = new ArrayList<Integer>();
    for (int element: findAverage) {
        if(element > average){
                greaterThanAverage.add(element);
        }
    }
    System.out.println("The Average is "+ average+" the numbers greater than average are "+ greaterThanAverage);

    // Question 4
        System.out.println("\n************ Question 4 ************\n");
    int[] threeNumArray = {20, 30, 40};
    if (threeNumArray[0] > threeNumArray[(threeNumArray.length-1)]){
        System.out.println("The largest number is "+ threeNumArray[0]);
    }else {
        System.out.println("The largest number is "+ threeNumArray[(threeNumArray.length-1)]);
    }

    // Question 5
        System.out.println("\n************ Question 5 ************\n");
    int[] swappedArray = new int[3];
    swappedArray[0] = threeNumArray[(threeNumArray.length-1)];
    swappedArray[swappedArray.length-1] = threeNumArray[0];
    for (int i = 1; i <threeNumArray.length-1 ; i++) {
        swappedArray[i] = threeNumArray[i];
    }
    System.out.println("The new swapped array is "+ Arrays.toString(swappedArray));
    
    // Question 6
        System.out.println("\n************ Question 6 ************\n");
        String[] names = {"cat", "dog", "red", "is", "am"};
        int maxLenOfWord = 0;
        for (String word : names){
            if(word.length() > maxLenOfWord)
                maxLenOfWord=word.length();
        }
        System.out.print("Result : ");
        for (String name: names){
            if(name.length() == maxLenOfWord)
                System.out.print(" \""+name+"\" ");
        }
        System.out.println("\n");

        // Question 7
        System.out.println("\n************ Question 7 ************\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = input.nextInt();
        int [] userArray = new int[size];
        int currentIndex = 0;
        int option=0;
        do {
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
            System.out.println("4. Sort the array");
            System.out.println("5. To Stop ");

            option = input.nextInt();
            switch(option){
                case 1: if (currentIndex < size){
                            System.out.println("Enter the number : ");
                            userArray[currentIndex]= input.nextInt();
                            System.out.println("Element ( "+userArray[currentIndex]+" ) has been added");
                            currentIndex++;
                        }else {
                            System.out.println("You can not add your array is Full !!!!");
                        }
                        break;
                case 2: System.out.println(Arrays.toString(userArray));
                        break;
                case 3:
                    System.out.println("Enter the number : ");
                    int num = input.nextInt();
                    boolean isThere = false;
                    for(int i =0 ; i<size; i++){
                        if(userArray[i] == num){
                            System.out.println("The number "+num+" exsist at index ["+i+"] ");
                            isThere = true;
                        }
                    }
                    if(isThere == false){
                        System.out.println("There is no "+num+" in the array !");
                    }
                    break;
                case 4:
                    for(int i =0 ; i < currentIndex ; i++){
                        for(int j =i+1; j<currentIndex; j++){
                            if(userArray[i] > userArray[j]){
                                userArray[i] ^= userArray[j];
                                userArray[j] ^= userArray[i];
                                userArray[i] ^= userArray[j];
                            }
                        }
                    }
                    System.out.println("The array after sorting : "+Arrays.toString(userArray));
                    break;
            }
        }while(option != 5);

        // Question 8
        System.out.println("\n************ Question 8 ************\n");
        // after sorting, I will look for the number of occurrence
        int[] numOfOccurrence = {1,1,1,3,3,5};
        for(int i =0 ; i < numOfOccurrence.length ; i++){
            for(int j =i+1; j<numOfOccurrence.length; j++){
                if(numOfOccurrence[i] > numOfOccurrence[j]){
                    numOfOccurrence[i] ^= numOfOccurrence[j];
                    numOfOccurrence[j] ^= numOfOccurrence[i];
                    numOfOccurrence[i] ^= numOfOccurrence[j];
                }
            }
        }
        System.out.println(Arrays.toString(numOfOccurrence));
        boolean isDone = false;
        for(int i=0 ; i< numOfOccurrence.length;){
            int occurrence=0;
            for(int j = i ; j <=numOfOccurrence.length ; j++){
                if(j == numOfOccurrence.length){
                    System.out.println("The occurrence of " + numOfOccurrence[i] + " is : " + occurrence);
                    isDone = true;
                    break;
                }
                if(numOfOccurrence[i] == numOfOccurrence[j]){
                    occurrence++;
                }else {
                    i=j;
                    break;
                }
            }

            if(isDone ==true)
                break;

            System.out.println("The occurrence of " + numOfOccurrence[i-1] + " is : " + occurrence);
        }



        // Question 9
        System.out.println("\n************ Question 9 ************\n");
        int[] oddBeforeArray = {2,3,40,1,5,9,4,10,7};
        for(int i=0; i<oddBeforeArray.length; i++){
            if(oddBeforeArray[i] %2 !=0){
                continue;
            }else{
                for(int j = i+1; j<oddBeforeArray.length; j++){
                    if(oddBeforeArray[j] %2 !=0){
                        oddBeforeArray[i] ^= oddBeforeArray[j];
                        oddBeforeArray[j] ^= oddBeforeArray[i];
                        oddBeforeArray[i] ^= oddBeforeArray[j];
                    }
                }
            }
        }
        System.out.println("The odd numbers are before even numbers : "+Arrays.toString(oddBeforeArray));


        // Question 10
        System.out.println("\n************ Question 10 ************\n");
        int [] match1 = {2,3,6,6,4};
        int [] match2 = {2,3,6,6,4};
        boolean isMatched = true;
        if(match1.length != match2.length){
            System.out.println("These arrays are not matched ! "+Arrays.toString(match1)+" != "+Arrays.toString(match2));
        }else {
            for(int i =0 ; i< match1.length; i++){
                if(match1[i] != match2[i]) {
                    isMatched = false;
                    System.out.println("These arrays are not matched ! "+Arrays.toString(match1)+" != "+Arrays.toString(match2));
                    break;
                }
            }
            if(isMatched == true){
                System.out.println("These arrays are the same "+Arrays.toString(match1)+" == "+Arrays.toString(match2));
            }
        }

    }

}