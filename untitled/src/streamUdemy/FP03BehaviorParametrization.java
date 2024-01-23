package streamUdemy;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03BehaviorParametrization {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(12, 7, 33, 4, 8, 3, 1, 15);

        filterAndPrint(numbers, x -> x%3==0);
        
        filterAndPrint(numbers, x -> x%2!=0);

    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
