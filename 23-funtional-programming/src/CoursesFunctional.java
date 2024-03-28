import java.util.List;

public class CoursesFunctional {
    public static void main(String[] args) {
        List<String> courses = List.of("spring", "spring boot", "API", "Microservices",
                "AWS", "Azure", "GCP");

        //printAllCourses(courses);
        //printSpringCourses(courses);
       // printCourseWithMin4Letters(courses);
        printNumberOfCharactersInEachCourse(courses);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream().forEach(System.out :: println);
    }


    public static void printSpringCourses(List<String> courses) {
        courses.stream().filter(course -> course.contains("spring")).forEach(System.out :: println);
    }

    private static void printCourseWithMin4Letters(List<String> courses) {
        courses.stream().filter(course -> course.length() >= 4).forEach(System.out :: println);
    }

    private static void printNumberOfCharactersInEachCourse(List<String> courses) {
        courses.stream().map(course -> course + " " + course.length()).forEach(System.out :: println);
    }

}
