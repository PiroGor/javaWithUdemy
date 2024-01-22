package streamUdemy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02StreamOperations {
    public static void main(String[] args){
        List<Integer> numbers=List.of(12,4,23,6,99,56,4);

        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        List<Integer> squaredNumbers=numbers.stream()
                .map(number->number*number)
                .collect(Collectors.toList());

        List<Integer> evenNumbers=numbers.stream()
                .filter(number->number%2!=0)
                .collect(Collectors.toList());

        int sum=numbers.stream()
                .reduce(0,(x,y)->x*x+y*y);

        int greatest=numbers.stream()
                .reduce(Integer.MIN_VALUE,(x,y)->x>y ? x:y);

        List<String> courses=List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<String> coursesSortedByLength=courses.stream()
                .sorted(Comparator.comparing(str->str.length()))
                .collect(Collectors.toList());

    }
    
}
