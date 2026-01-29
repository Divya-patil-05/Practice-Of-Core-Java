package Stream_API_AssignmentInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import java.util.*;
import java.util.stream.*;

public class ReverseOrder {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55, 60);

        // Sort the list in reverse order using Stream API
        List<Integer> sortedList = numbers.stream()
                                          .filter(null)
                                          .collect(Collectors.toList());

        // Print the result
        System.out.println("List sorted in reverse order: " + sortedList);
    }
}


