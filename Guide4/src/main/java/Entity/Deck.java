package Entity;
        
import java.util.ArrayList;
import java.util.Collections;

        
public class Deck {
    ArrayList<Card> deckOfCard = new ArrayList<>();
    ArrayList<Card> deckOfCardOut = new ArrayList<>();
    
    public Deck() {
    }
    
    public void shuffle(){
        Collections.shuffle(this.deckOfCard);
    }
    
    public String nextCard(){
        if (this.deckOfCard.isEmpty()){
            return "No quedan cartas";
        } else {
            return "La siguiente carta es: " + this.deckOfCard.get(0).toString();
        }
    }
    
    public String dealCards(int numberOfCards){
        if (numberOfCards != 0){
            if (this.deckOfCard.size() < numberOfCards){
                return "Imposible";
            }
            for (int i=0; i < numberOfCards; i++){
                this.deckOfCardOut.add(this.deckOfCard.remove(0));
            }
            return "Complete";
        } else {
            return "Imposible 2";
        }
    }
    
    public void pileOfOut(){
        System.out.println("Las cartas que han salido son: ");
        for (Card auxCard : this.deckOfCard){
            System.out.println(auxCard);
        }
    }
    
    public int remainsCard(){
        return this.deckOfCard.size();
    }
    
    
}
