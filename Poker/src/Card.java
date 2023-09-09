public class Card implements Comparable<Card>{
private final Suits suit;
    private final Number number;

    Card(Suits suit, Number number) {

        this.suit = suit;
        this.number = number;
    }

    public Number getNumber(){
        return this.number;
    }

    @Override
    public String toString() {
        return suit + " " + number.getName();
    }

    @Override
    public int compareTo(Card o) {
        return this.number.getValue() - o.number.getValue();
    }

    @Override
    public boolean equals(Object obj) {
            if(obj instanceof Card){
                Card card = (Card)obj;
                String cardName1 = this.number.getName();
                String cardName2 = card.number.getName();
                return cardName1.equals(cardName2);
            } else{
                return false;
            }
    }

    @Override
    public int hashCode() {
        return number.getName().hashCode();
    }

    

    

            

}
