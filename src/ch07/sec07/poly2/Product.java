package ch07.sec07.poly2;

    //제품의 가격 정보를 저장할 수 있다 . price
    //제품 구매 시 제공하는 보너스 점수 저장할 수 있다 . bonusPoint
    // Product는 객체화 금지 - > abstract
public abstract class Product {
    private final int price; //단위는 만원 단위
    private final int bonusPoint;

  public Product(int price){
      this.price = price;
      this.bonusPoint=(int)price/10;
  }


    public int getPrice(){
        return price;
    }

    public int getBonusPoint(){
        return bonusPoint;
    }


}
