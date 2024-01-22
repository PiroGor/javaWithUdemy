package streamUdemy;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args){
        List<Integer> numbers=List.of(12,4,23,6,99,56,4);
        //printAllNumbersInLIstFunctional(numbers);
       // printEvenNumbersInLIstFunctional(numbers);
        printSquaresOfEvenNumbersInLIstFunctional(numbers);
    }

//    private static boolean isEven(int number){
//        return number%2==0;
//    }


    private static void printAllNumbersInLIstFunctional(List<Integer> numbers){
        numbers.stream()
                .forEach(System.out::println); //Method Reference
    }

    private static void printEvenNumbersInLIstFunctional(List<Integer> numbers){
        numbers.stream()
                //.filter(FP01Functional::isEven)//Filter - Only even numbers
                .filter(number -> number%2==0) //Lambda Expession
                .forEach(System.out::println); //Method Reference
    }

    private static void printSquaresOfEvenNumbersInLIstFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2==0) //Lambda Expession
                .map(number -> number*number)
                .forEach(System.out::println); //Method Reference
    }
}
