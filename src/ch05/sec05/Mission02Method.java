package ch05.sec05;

public class Mission02Method {
    public static void main(String[] args) {
        String ext = getExt("sadf.sdkf.jpg"); //"jpg"리턴
        System.out.println(ext);

        String ext2 = getExt("sadf223.sdkf478.jpeg"); //"jpeg"리턴
        System.out.println(ext2);



    }
    public static String getExt(String get){
        int index = get.lastIndexOf(".");
        String ext = get.substring(index+1);
        return ext;
    }

}
