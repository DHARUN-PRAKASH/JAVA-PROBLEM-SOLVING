public class CompareTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3};

        for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]!= arr2[i]) {
                    System.out.println("Arrays are not equal at "+i);
                    return;
            }
        }

    }
    
}
