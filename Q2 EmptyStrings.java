import java.util.Arrays;
import java.util.List;

public class EmptyStrings {
    public static void main(String[] args){

     //Creating list of strings
     List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

     //Using filter method check the given list of strings are empty with the isEmpty method
     List<String> nonEmptyStrings = strings.stream().filter(str -> !str.isEmpty()).toList();

        //Display the result
        System.out.println(nonEmptyStrings);
    }
}
