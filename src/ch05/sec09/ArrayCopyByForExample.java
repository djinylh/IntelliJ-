package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample {
    public static void main(String[] args) {

        int[] oldIntArray= new int[3]; //길이가 3인 배열을 만들어주세요

        for(int i=0; i < oldIntArray.length; i++) {
            oldIntArray[i] = i + 1;

        }
        int[] newIntArray = new int[oldIntArray.length];

for(int i=0; i<oldIntArray.length;i++){
    newIntArray[i] = oldIntArray[i];

}



        System.out.println(Arrays.toString(oldIntArray)); // 123
        System.out.println(Arrays.toString(newIntArray)); //123

        oldIntArray[0] = 10;
        System.out.println(Arrays.toString(oldIntArray)); // 10 2 3
        System.out.println(Arrays.toString(newIntArray)); // 123
    }
}
