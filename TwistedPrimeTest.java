public class TwistedPrimeTest {
    public static void main(String[] args) {
        int num = 79;
        
        if (num < 0) {
            System.out.println("Invalid Input");
        } else {
            if (isTwistedPrime(num)) {
                System.out.println(num + " is a Twisted Prime number.");
            } else {
                System.out.println(num + " is not a Twisted Prime number.");
            }
        }
    }
    
    
}
