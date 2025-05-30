package ch05.sec06;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        String[] season = {"Spring","Summer","Fall","Winter"};

        System.out.println(season[0]);

        int[] scores = {83,90,87};

        int sum = 0;

        for(int i=0; i<scores.length;i++) {
            sum += scores[i];
        }
        System.out.println(sum);

        int a = 0;
        for(int score:scores) {
            a += score;
        }
        System.out.println((double)a/scores.length);
    }
}
