import java.util.*;
import java.util.stream.Stream;

public class Map {

    public static void main(String[] args){

        //creating Streams of Strings
        Stream<String> names = Stream.of("aBc","d","e","f");

        //Using stream map fn to convert the each string into uppercase
        List<String> result = names.map(String::toUpperCase).toList();

        //Display the new stream of uppercase Strings
        System.out.println(result);
    }
}
