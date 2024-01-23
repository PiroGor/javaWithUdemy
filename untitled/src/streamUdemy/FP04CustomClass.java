package streamUdemy;


import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }


    public int getNoOfStudents() {
        return noOfStudents;
    }

    public String getCategory() {
        return category;
    }

    public int getReviewScore() {
        return reviewScore;
    }


    public String getName() {
        return name;
    }

    public String toString(){
        return name + " " + noOfStudents + ":" +reviewScore;
    }


}
public class FP04CustomClass {
    public static void main(String[] args){
        List<Course> courses = List.of(
                new Course("Spring", "Framework",98,20000),
                new Course("Spring Boot", "Framework",95,18000),
                new Course("API", "Microservices",97,22000),
                new Course("Microservices", "Microservices",96,25000),
                new Course("FullStuck", "FullStuck",91,14000),
                new Course("AWS", "Cloud",92,21000),
                new Course("Azure", "Cloud",99,21000),
                new Course("Docker", "Cloud",92,2000),
                new Course("Kubernetes", "Cloud",91,2000)
        );

        //allMatch, noneMatch, anyMatch
        Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;

        Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore()>90;

        Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore()<90;

        System.out.println(
                courses.stream().allMatch(reviewScoreGreaterThan95Predicate));

        System.out.println(
                courses.stream().noneMatch(reviewScoreGreaterThan90Predicate));

        System.out.println(
                courses.stream().anyMatch(reviewScoreLessThan90Predicate));

        System.out.println(
                courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));

        Comparator comparingByNoOFStudentsIncreasing = Comparator.comparing(Course::getNoOfStudents);

        Comparator comparingByNoOFStudentsDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed();

        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOFStudentsIncreasing)
                        .collect(Collectors.toList()));

        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOFStudentsDecreasing)
                        .collect(Collectors.toList()));

        Comparator<Course> comparinByNoOfStudentsAndNoOfReview =
                Comparator.comparing(Course::getNoOfStudents)
                        .thenComparing(Course::getReviewScore)
                        .reversed();

        System.out.println(
                courses.stream()
                        .sorted(comparinByNoOfStudentsAndNoOfReview)
                        .collect(Collectors.toList())
        );

        System.out.println(
                courses.stream()
                        .sorted(comparinByNoOfStudentsAndNoOfReview)
                        .limit(5)
                        .collect(Collectors.toList())
        );

        System.out.println(
                courses.stream()
                        .sorted(comparinByNoOfStudentsAndNoOfReview)
                        .skip(3)
                        .collect(Collectors.toList())
        );

        System.out.println(
                courses.stream()
                        .sorted(comparinByNoOfStudentsAndNoOfReview)
                        .skip(3)
                        .limit(5)
                        .collect(Collectors.toList())
        );

        System.out.println(courses.stream()
                .takeWhile(course -> course.getReviewScore()>=95)
                .collect(Collectors.toList()));

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan95Predicate)
                        .mapToInt(Course::getNoOfStudents)
                        .sum()
        );

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan95Predicate)
                        .mapToInt(Course::getNoOfStudents)
                        .average()
        );

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan95Predicate)
                        .mapToInt(Course::getNoOfStudents)
                        .count()
        );

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan95Predicate)
                        .mapToInt(Course::getNoOfStudents)
                        .max()
        );

    }
}
