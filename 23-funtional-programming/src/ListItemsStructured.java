import java.util.List;

public class ListItemsStructured {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 5, 7, 2);
        //printAllNumbersInListStructured(List.of(12,9,13,4,5,7,2));
        printEvenNumbersInListStructured(numbers);
    }
    private static  void printAllNumbersInListStructured(List<Integer> numbers) {
        for(int number : numbers) {
            System.out.println(number);
        }
    }

    private static  void printEvenNumbersInListStructured(List<Integer> numbers) {
        for(int number : numbers) {
            if(number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
