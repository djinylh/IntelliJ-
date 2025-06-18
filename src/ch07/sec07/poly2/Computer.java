package ch07.sec07.poly2;

//Computer Product를 상속받는다
// 컴퓨터 가격은 무조건 200만원
//컴퓨터 객체의 주소값을 프린트에 찍으면 "Computer"가 출력되어야 한다

public class Computer extends Product {

    public Computer() {
        super(200);
    }

    @Override
    public String toString(){

        return "Computer";
    }


}
