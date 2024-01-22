package streamUdemy;

import java.util.List;
public class FP01Structured {

    public static void main(String[] args){


        printAllNumbersInListStructured(List.of(12,4,23,6,99,56,4));
        printEvenNumbersInListStructured(List.of(12,5,66,7,3,44,5,6));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers){
    for(int number:numbers){
        System.out.println(number);
     }
    System.out.println();
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers){
        for(int number:numbers){
            if(number%2==0){
                System.out.println(number);
            }

        }
    }

    
}