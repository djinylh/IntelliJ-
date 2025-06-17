package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];


    public int size() {
        return arr.length;
    }
    public void add(String item){
        String[] temp = new String[arr.length+1];

    temp[arr.length] = item;
        //기존값 복사
    for(int i=0 ; i < size(); i++){
        temp[i] = arr[i];
    }
    this.arr = temp;


}
    public void add(int index, String string){
        String[] temp = new String[arr.length+1];
        for(int i=0 ; i < arr.length; i++){
            if(i < index) {
                temp[i] = arr[i];
            } else {
                temp[i+1] = arr[i];
            }
            temp[index] = string;
//                temp[i <index ? i : i +1] = arr[i];
        }
        this.arr = temp;


    }
//점검용
public void checkValues() {
    System.out.println(Arrays.toString(this.arr));
}

public String get(int num){
        return arr[num];
}

public String remove(){
        String[] temp = new String[arr.length-1];
        String etc = arr[temp.length];

        for(int i = 0; i <temp.length; i++){
            temp[i] = arr[i];
        }
        arr=temp;
return etc;
}
public String remove(int num){
    String[] temp = new String[arr.length-1];
    String a = arr[num];
    for(int i = 0 ; i <= temp.length; i++) {
        temp[i] = arr[i< num ? i : i +1 ];
    }
    arr= temp;

        return a;
}

}

