import java.util.Scanner;
import java.util.Random;

public class DogGenetics {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Random Ran = new Random();
        
        String dogName;
        String [] Breeds = {"St. bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur","King Doberman"};
        int per =0, rando =0, curve = 20;

        System.out.print("What is you dog's name? ");
        dogName = Scan.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName+"'s prestigious background right here.");
        for(int i =0;i<4;i++){
            rando = Ran.nextInt(100-per-curve);
            per+=rando;
            curve =0;
            System.out.println(rando +"% "+Breeds[i]);
        }
        System.out.println(100-per +"% "+Breeds[4]);
        System.out.println("\nWow, that's QUITE the dog!");
    }
}
