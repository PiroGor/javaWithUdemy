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
        System.out.println(exercisePart4_1(numbers));
        System.out.println(exercisePart4_2(numbers));
        System.out.println(exercisePart4_3(numbers));
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
        numbers.stream()                                    //exercise 5
                .filter(number->number%2!=0)
                .map(number->number*number*number)
                .forEach(System.out::println);
    }

    private static void exercisePart3_2(List<String> courses){
        courses.stream()                                   //exercise 6
                .map(course->course+" "+course.length())
                .forEach(System.out::println);
    }

    private static int exercisePart4_1(List<Integer> numbers){
        return numbers.stream()                            //exercise 7
                .map(x->x*x)
                .reduce(0,Integer::sum);
    }

    private static int exercisePart4_2(List<Integer> numbers){
        return numbers.stream()                                 //exercise 8
                .map(number->number*number*number)
                .reduce(0,Integer::sum);
    }
    private static int exercisePart4_3(List<Integer> numbers){
        return numbers.stream()                                   //exercise 9
                .filter(x->x%2!=0)
                .reduce(0,Integer::sum);
    }
}
