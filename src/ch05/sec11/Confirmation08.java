package ch05.sec11;

public class Confirmation08 {
    public static void main(String[] args) {
        int sum = 0;
        int cnt = 0;

        int[][] arr= {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        for(int i=0; i< arr.length;i++){

            cnt += arr[i].length;
            for (int k=0; k< arr[i].length; k++){
                sum += arr[i][k];
            }
        }

        System.out.println(sum);

        // 전체 합계


        //평균
        System.out.println((double)sum/cnt);
    }
}
