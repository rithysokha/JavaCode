//group8
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise1 {
    public static void main(String[] args) {

        //Create HashMAp to store values
        HashMap< String , String > countries = new HashMap<>();

        //Insert key and value
        countries.put("Thailand" , "Bangkok");
        countries.put("Japan" , "Tokyo");
        countries.put("India" , "Delhi");
        countries.put( "Cambodia" , "Phnom Penh");
        countries.put("Malaysia" , "Kuala Lumpur");
        countries.put("Lao" , "Vientiane");
        countries.put("China" , "Beijing");
        countries.put("America" , "Washington.D.C");
        countries.put("Russia" , "Moscow");
        countries.put("Australia" , "Canberra");

        Scanner input = new Scanner(System.in);

        //Create ArrayList to store key in HashMap in order to random key
        ArrayList<String> hashMapKeys = new ArrayList<>(countries.keySet());
        Collections.shuffle(hashMapKeys);

        //Create a variable to count score
        int score = 0;

        //Loop and ask question
        for (String key : hashMapKeys){
            System.out.println( "What is the capital of : " + key + " ? ");
            System.out.print("Enter Capital: ");
            String nameCountry = input.nextLine();
            if (countries.get(key).equalsIgnoreCase(nameCountry)){
                System.out.println("Correct");
                score++;
            }
            else {
                System.out.println("Incorrect " + countries.get(key));
            }
        }
        System.out.println("==> Total score is: " + score);
        input.close();
    }
}