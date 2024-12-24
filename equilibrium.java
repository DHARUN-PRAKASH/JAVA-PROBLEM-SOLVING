public class equilibrium {
    public static void main(String[] args) {
        int [] array = {-7,1,5,2,-4,3,0};
        int sum = 0;
        int sum2 = 0;
        for (int i=0;i<array.length;i++){
             sum = array[i]-array[i+1];
            for (int j=-1;j<array.length;j--){
                 sum2 = array[j]+array[j-1];
        }
            if (sum == sum2 ){
        System.out.println("equilibrium");
    }

    }
}
    
}
