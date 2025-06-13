package blackjack;

public class Card {

    private String pattern;
    private String denomination;

    public Card(String pattern,String denomination){

        this.pattern = pattern;
        this.denomination = denomination;



    }
public String getPattern(){
    return pattern;
}
public String getDenomination(){
        return denomination;
}

@Override
    public String toString(){
        return  String.format("%s (%s)\n", this.getPattern(), this.getDenomination());
}


//public void setPattern(String pattern){
//        this.pattern = pattern;
//}
//public void setDenomination(String denomination){
//        this.denomination = denomination;
//}
}

