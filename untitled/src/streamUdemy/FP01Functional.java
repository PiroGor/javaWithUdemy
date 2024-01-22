package streamUdemy;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args){
        printAllNumbersInLIstFunctional(List.of(12,4,23,6,99,56,4));
    }

    private static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInLIstFunctional(List<Integer> numbers){
        numbers.stream()
                .forEach(FP01Functional::print); //Method Reference
    }
}
