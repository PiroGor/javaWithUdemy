package streamUdemy;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args){
        List<Integer> numbers=List.of(12,4,23,6,99,56,4);
        printOddNumbersInLIstFunctional(numbers);

        List<String> courses=List.of("Spring", "Spring Boot", "API", "Microservices",
                                     "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        exercisePart2(courses);
        exercisePart3_1(numbers);
        exercisePart3_2(courses);
    }



    private static void printOddNumbersInLIstFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2 != 0) //Lambda Expression
                .forEach(System.out::println); //Method Reference
    }

    private static void exercisePart2(List<String> courses){
        courses.stream().forEach(System.out::println);      //Exercise 2

        courses.stream()                                    //Exercise 3
                .filter(course->course.contains("Spring"))
                .forEach(System.out::println);

        courses.stream()                                    //Exercise 4
                .filter(course->course.length()==4)
                .forEach(System.out::println);
    }

    private static void exercisePart3_1(List<Integer> numbers){
        numbers.stream()
                .filter(number->number%2!=0)
                .map(number->number*number*number)
                .forEach(System.out::println);
    }

    private static void exercisePart3_2(List<String> courses){
        courses.stream()
                .map(course->course+" "+course.length())
                .forEach(System.out::println);
    }
}
