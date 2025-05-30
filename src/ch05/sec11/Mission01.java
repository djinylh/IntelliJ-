package ch05.sec11;

public class Mission01 {
    public static void main(String[] args) {
int sum = 0;
int num = 0;

        for(int i=0 ; i < args.length; i++){
            num = Integer.parseInt(args[i]);
            sum += num;


        }
        System.out.println(sum);
    }
}

