import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void add(Card card){
        hand.add(card);
    }

    public void print(){
        for (Card c: hand) {
            System.out.println(c);
        }
    }

    public void sort(){
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand o) {
        int sum = 0;
        int sum2 = 0;
        for (Card c: this.hand) {
            sum += c.getValue();
        }

        for (Card c: o.hand) {
            sum2 += c.getValue();
        }

        return sum - sum2;
    }

    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
