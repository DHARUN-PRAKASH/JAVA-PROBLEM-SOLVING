import java.util.Arrays;


public class inversiondivide {    public static void main(String[] args) {
        int[] myArray = {1,9,6,4,5};
        divide(myArray, 0, myArray.length-1);
        // System.out.println(Arrays.toString(myArray));
    }

    public static void mergeAndSort(int[] arr, int start, int mid, int end){
        int lengthWest = mid - start+1;
        int lengthEast = end - mid;
        int west, east, index;
        System.out.println(lengthWest+" "+lengthEast);
        int[] westArray = new int[lengthWest];
        int[] eastArray = new int[lengthEast];

        for(west = 0;west < lengthWest;west++){
            westArray[west] = arr[start+west];
        }

        for(east=0;east<lengthEast;east++){
            eastArray[east]=arr[mid+1+east];
        }

        System.out.println("West Array "+Arrays.toString(westArray));
        System.out.println("East Array "+Arrays.toString(eastArray));


        int count = 0;
        
        if (arr[west]>arr[east]){
            count++;
            System.out.println("(" +westArray[lengthWest]+","+ eastArray[lengthEast]+")");
        }
        System.out.println("Number of inversions: "+count);
        
    }


    public static void divide(int[] arr, int start, int end){
        // System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end+1)));
        if(start<end){
            int mid = start+(end-start)/2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            mergeAndSort(arr, start, mid, end);
        }
    }
    
}
