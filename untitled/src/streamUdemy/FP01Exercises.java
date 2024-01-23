package streamUdemy;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

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

        sortExample(courses);

        List<Integer> evenNumbers=exercisePart5_1(numbers);
        System.out.println(evenNumbers);

        List<Integer> lengthsOfCourses=lengthsOfAllCoursesTitle(courses);
        System.out.println(lengthsOfCourses);
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

    private static void sortExample(List<String> courses){
        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        courses.stream()
                .sorted(Comparator.comparing(str->str.length()))
                .forEach(System.out::println);
    }

    private static List<Integer> exercisePart5_1(List<Integer> numbers){
        return numbers.stream()                                 //exercise 10
                .filter(number->number%2!=0)
                .collect(Collectors.toList());
    }

    private static List<Integer> lengthsOfAllCoursesTitle(List<String> courses){
        return courses.stream()                                 //exercise 11
                .map(course->course.length())
                .collect(Collectors.toList());
    }

    private static void exercisePart6(List<Integer> numbers){
        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;

        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer arg0, Integer arg1) {
                return arg0 + arg1;
            }
        };
        int sum = numbers.stream()
                .reduce(0, sumBinaryOperator);
    }
}
