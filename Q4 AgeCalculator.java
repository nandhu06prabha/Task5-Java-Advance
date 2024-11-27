import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args){
        //Create a Scanner object to get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthday(yyyy-mm-dd) : ");
        String birthdaystring =sc.nextLine();
        LocalDate birthdayDate = LocalDate.parse(birthdaystring);
        //transform thr birthday string into LocalDate object
        LocalDate currentDate = LocalDate.now();

        //Calculate the age using period class
        Period age = Period.between(birthdayDate, currentDate);

        //Display the age
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + "days.");
    }
}
