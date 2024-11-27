import java.util.Arrays;
import java.util.List;

public class SpecialGifts {
    public static void  main(String[] args){
        //List of student names
        List<String> studentNames = Arrays.asList("Anu","Ashok","Ben","ken","jaden","Alphonse","Jose","Alpha");

        //Filter the names Start with "A"
        List<String> SpecialGiftsA = studentNames.stream().filter(name -> name.startsWith("A")).toList();

        //display the result
        System.out.println(SpecialGiftsA);
    }
}
