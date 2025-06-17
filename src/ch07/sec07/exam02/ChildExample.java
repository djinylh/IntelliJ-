package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();
        System.out.println("-------------------------");
Parent parent = child;
// 타입은 알고 있는 메소드만 호출할 수 있다 .
        parent.method1();
        parent.method2();
//        parent.method3(); 이거 안 됨 Parent에서는 메소드3이 없기 때문이다.
        // method3()메소드를 알고 있는 타입으로 강제 형변환 해주면 된다.
        Child child2 = (Child) parent;
        child2.method3();
    }
}
