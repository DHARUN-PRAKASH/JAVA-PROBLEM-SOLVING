public class TwoMInValue {
    public static void main(String[] args) {
        int[] arr = {5,10,8,11};

        int min1 = Integer.MAX_VALUE;

        int min2 = Integer.MAX_VALUE;
        for(int index=0;index<arr.length;index++){
            if(arr[index]<min1){
                min2 = min1;
                min1 = arr[index];
            }
            else if(arr[index]<min2){
                min2 = arr[index];
            }
        }
        System.out.println("Min1: "+min1);
        System.out.println("Min2: "+min2);



        int third = min2 - min1;
        int result = (min2)+1 - third;

        System.out.println("Result: "+result);
        
    }
    


}
