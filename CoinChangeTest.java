public class CoinChangeTest {
    public static void main(String[] args) {

        int[] arr ={5,2,1};
        int sum = 0;
        int total = 0;

        for ( int i = 0 ; i <= arr.length ; i++){
            for ( int j = i ; j <= arr.length; j++ ){
            sum = sum + arr[i];
            System.out.println(sum);
            
        }


    }
}
    
}
