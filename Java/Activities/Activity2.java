package activities;

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 77, 10, 54, -11, 10};
        System.out.println(Arrays.toString(arr));
        int TotalValue=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==10){
                TotalValue=TotalValue+arr[i];
               if(TotalValue==30) {
                    System.out.println("Sum of all the 10's in the array:" + TotalValue);
                    break;
                }
            }
        }
        if(TotalValue!=30) {
           System.out.println("Sum of all the 10's in the array is not equal to 30");

        }
    }
}