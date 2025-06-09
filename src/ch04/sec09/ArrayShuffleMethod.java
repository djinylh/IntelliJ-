package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr = makeArrayFromTo(5, 8); // [ 5,6,7]
        System.out.println(Arrays.toString(arr));
        int[] arr2 = makeArrayFromTo(15,20); // [ 15,16,17,18,19]


        System.out.println("======================");

        shuffleArray(arr);
        System.out.println(Arrays.toString(arr));

        shuffleArray(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] makeArrayFromTo(int num1, int num2 ){
        int[] arr= new int[num2-num1];
        for (int i = 0; i < arr.length; i++){
            arr[i]=num1+i;
        }
        return arr;

    }

    public static void shuffleArray(int[] arr){
        for(int i=0; i <arr.length;i++) {
            int random = (int)(Math.random()* arr.length);
            int temp = arr[random];
            arr[random] = arr[i];
            arr[i] = temp;
        }


    }


}
