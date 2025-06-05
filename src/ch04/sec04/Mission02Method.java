package ch04.sec04;

public class Mission02Method {
    public static void main(String[] args) {
        printNumberFromto(2,6); // [ 2,3,4,5,6]
        printNumberFromto(12,16); //
    }
public static void printNumberFromto(int a, int b){
    System.out.print("[");
for(int i=a; i<=b;i++){
    System.out.print(i);

    if(i < b){

        System.out.print(",");
    }

}

    System.out.print("]");
    System.out.println();
}
}

