package streamUdemy;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args){
        List<Integer> numbers=List.of(12,4,23,6,99,56,4);
        printAllNumbersInLIstFunctional(numbers);
        printEvenNumbersInLIstFunctional(numbers);
    }

    private static boolean isEven(int number){
        return number%2==0;
    }


    private static void printAllNumbersInLIstFunctional(List<Integer> numbers){
        numbers.stream()
                .forEach(System.out::println); //Method Reference
    }

    private static void printEvenNumbersInLIstFunctional(List<Integer> numbers){
        numbers.stream()

                .filter(FP01Functional::isEven)//Filter - Only even numbers
                .forEach(System.out::println); //Method Reference
    }
}