import java.util.Arrays;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++){
            int x = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = x;
        }
        return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int largest = -99999;
        int secondlargest = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondlargest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        if (arr.length <= 2){
            System.out.println("This array is geometric.");
            return true; 
        }
        double geometric = (double)arr[0]/(double)arr[1];
        System.out.println(geometric);
        for (int i = 0; i < arr.length - 1; i++){
            if (geometric != (double)arr[i]/(double)arr[i + 1]){
                System.out.println("This array is not geometric");
                return false;
            }   
        }
        System.out.println("The array is geometric.");
        return true;
    }

    public static void main(String[] args) {
        int arr[]= {1, 3, 9, 27, 81};
        reverse(arr);
        secondLargest(arr);
        isGeometric(arr);
        } 

}

