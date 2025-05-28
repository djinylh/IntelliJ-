package ch04.sec04;

public class Mission04 {
    public static void main(String[] args) {

        int dan = (int)(Math.random()* 11.0) +2;

        for(int i =1; i<10; i++){

            System.out.printf("%d * %d = %d\n", dan, i, dan*i);

        }


    }
}
