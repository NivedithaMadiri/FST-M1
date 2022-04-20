package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] numarr = {2,1,8,3,5,0,4};
        System.out.println("Array Before Sorting:"+ Arrays.toString(numarr));
        for(int i=0;i<= numarr.length;i++) {

            for (int j = i + 1;  j<numarr.length;j++){
                int temp = 0;
                if (numarr[j] < numarr[i]) {
                    temp=numarr[i];
                    numarr[i]=numarr[j];
                    numarr[j]=temp;

                }


            }

        }
        System.out.println("Array After Sorting:" + Arrays.toString(numarr));
    }
}
