package ch04.sec04;

public class Mission03 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0 ) +3;
        System.out.println(star);

        for(int i=0; i<star;i++){
            System.out.println();
            for(int a=0; a<star;a++) {
                System.out.print("*");
            }
        }


    }
}
