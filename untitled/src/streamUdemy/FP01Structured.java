package streamUdemy;

import java.util.List;
public class FP01Structured {

    public static void main(String[] args){
        printAllNumbersInListStructured(List.of(12,4,23,6,99,56,4));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers){
    for(int number:numbers){
        System.out.println(number);
     }
    }

    
}