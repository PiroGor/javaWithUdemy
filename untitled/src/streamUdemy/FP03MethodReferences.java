package streamUdemy;

import java.util.List;

public class FP03MethodReferences {

    @SuppressWarnings("unused")
    public static void main(String[] args){

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream()
                //.map(str -> str.toUpperCase())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
