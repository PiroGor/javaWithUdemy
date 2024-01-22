package streamUdemy;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args){
        List<Integer> numbers=List.of(12,4,23,6,99,56,4);
        printOddNumbersInLIstFunctional(numbers);

        List<String> courses=List.of("Spring", "Spring Boot", "API", "Microservices",
                                     "AWS", "PCF", "Azure", "Docker", "Kubernetes");


        courses.stream().forEach(System.out::println);

        courses.stream()
                .filter(course->course.contains("Spring"))
                .forEach(System.out::println);

        courses.stream()
                .filter(course->course.length()==4)
                .forEach(System.out::println);
    }



    private static void printOddNumbersInLIstFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2 != 0) //Lambda Expession
                .forEach(System.out::println); //Method Reference
    }
}
