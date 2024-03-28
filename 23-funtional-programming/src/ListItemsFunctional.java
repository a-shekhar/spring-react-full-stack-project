import java.util.List;

public class ListItemsFunctional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 5, 7, 2);
        //printAllNumbersInListFunctional(numbers);
        //printEvenNumbersInListFunctional(numbers);
        //printOddNumbersInListFunctional(numbers);
        // printSquaresOfEvenNumbersInListFunctional(numbers);
        printCubesOfOddNumbersInListFunctional(numbers);
    }

    private static void print(int number){
        System.out.println(number);
    }

    private static  void printAllNumbersInListFunctional(List<Integer> numbers) {
//        for(int number : numbers) {
//            System.out.println(number);
//        }

        // method reference
       // numbers.stream().forEach(ListItemsFunctional::print);
        numbers.stream().forEach(System.out::println);
    }

    private static boolean isEven(int number){
        return number % 2 == 0;
    }
    private static  void printEvenNumbersInListFunctional(List<Integer> numbers) {
//        numbers.stream() // only allow even numbers
//                .filter(ListItemsFunctional::isEven)
//                .forEach(System.out::println);

        numbers.stream() // only allow even numbers
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    private static  void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out :: println);
    }

    private static  void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream() // only allow even numbers
                .filter(n -> n % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static  void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0)
                .map(number -> number * number * number).forEach(System.out :: println);
    }
}
