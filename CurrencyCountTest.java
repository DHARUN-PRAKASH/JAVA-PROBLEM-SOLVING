
import java.util.Scanner;

public class CurrencyCountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[9];

        for ( int i=0 ; i<9 ; i++ ) {
            if ( amount >= notes[i] ) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            } else {
                noteCounter[i] = 0;
            }
            System.out.println(notes[i] + " : " + noteCounter[i]);
        }

        
        sc.close();

    }
    
}
