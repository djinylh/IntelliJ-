package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
    int[] arr= new int[10];
    for(int i=0; i<arr.length; i++){
        arr[i] = i+1;
    }

        System.out.println(Arrays.toString(arr));
int b=0;


for(int i=0; i<arr.length; i++){
    int a = (int)(Math.random()*10.0);
    b = arr[i];
    arr[i] = arr[a];
    arr[a] = b;
    System.out.println(a + " : " + i + Arrays.toString(arr));

}

    }



    }


