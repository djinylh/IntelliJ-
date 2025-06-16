package blackjack;

import java.util.List;

public class Rule {

public static void getWinner(Dealer dealer, Gamer gamer) {
    // 경우의 수 4가지
    // 1. 둘 다 총 점수가 21점 초과 >> 비김
    // 2. 둘 다 총 점수가 21점 이하이지만 점수가 같음 >> 비김
    // 3. 딜러의 총 점수가 21점 초과 게이머의 총 점수가 21점 이하 >> 게이머 승
    // 4. 둘 다 총 점수가 21점 이하이지만 게이머의 총 점수가 21점에 가까움 >> 게이머 승
    // 5. 게이머의 총 점수가 21점 초과 딜러의 총 점수가 21점 이하 >> 딜러 승
    // 6. 둘 다 총 점수가 21점 이하이지만 딜러의 총 점수가 21점에 가까움 >> 딜러 승

    int dealerScore = Rule.getScore(dealer.openCards());
    int gamerScore = Rule.getScore(gamer.openCards());

    if (dealerScore >21 && gamerScore >21) {
        System.out.println("비김");
    } else if ((dealerScore <= 21 && gamerScore <=21) && dealerScore==gamerScore){
        System.out.println("비김");
    } else if ( dealerScore >21 && gamerScore <= 21) {
        System.out.println("게이머 승");
    } else if ((dealerScore<=21 && gamerScore<=21)&&gamerScore>dealerScore) {
        System.out.println("게이머 승");
    } else if ( gamerScore > 21 && dealerScore <= 21) {
        System.out.println("딜러 승");
    } else if ((dealerScore<=21 && gamerScore<=21) && gamerScore<dealerScore){
        System.out.println("딜러 승");
    }

/*
if(dealerScore > MAX_SCORE && gamerSCORE > MAX_SCORE || dealerScore == gamerScore) {
sout("Tie");
}
else if ( dealerScore <= MAX_SCORE && gamerScore <= MAX_SCORE) {
sout(dealerScore>gamerScore ? "Dealer Win" : "GAmer Win");
}
else if( dealerScore <= MAX_SCORE) {
sout("Dealer Win");
}
else {
sout("gamer Win");
}

* */
}
    public static int getScore(List<Card> cards) {
int score = 0;
for(Card card: cards){
    int eachScore = convertDenominationToScore(card.getDenomination());
    score += eachScore;
}
     return score;
    }
    private static int convertDenominationToScore(String denomination){
        return switch (denomination) {
            case "A" -> 1;
            case "J","Q","K" -> 10;
            default -> Integer.parseInt(denomination);
        };
    }
}
