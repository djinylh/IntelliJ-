package blackjack;

import java.util.List;

public class BlackJack {
    public static void main(String[] args) {
    CardDeck cd = new CardDeck();
//    cd.printAllCards();
    Card c = cd.getCard();
        System.out.println(c);
        System.out.println(cd.getCard());
        System.out.println(cd.getCard());

        System.out.println("----------------------");
        cd.printAllCards();

    // Object obj = cd;
//obj = 1;
//        System.out.println(cd);
//        System.out.println(cd.toString());
//        System.out.println();
//
//        String str = "안녕";
//        System.out.println(str);
//        System.out.println(str.toString());
        System.out.println("-----------게이머 카드---------------");
        Gamer gamer = new Gamer();
        gamer.receiveCard(c);
        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());
        gamer.showCards();
        List<Card> cards = gamer.openCards();
        int score = Rule.getScore(cards);
        System.out.printf("score: %d\n",score);


        System.out.println("----------딜러 카드 -----------");

        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());

        if(dealer.needMoreCard()){
            dealer.receiveCard(cd.getCard());
        }
        dealer.showCards();
        List<Card> cards2 = dealer.openCards();
        int score2 = Rule.getScore(cards2);
        System.out.printf("score: %d\n",score2);
        Rule.getWinner(dealer,gamer);
    }
}
