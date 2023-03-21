package Entity;

import java.util.ArrayList;


public class Game {

    ArrayList<Player> Players = new ArrayList<>();
    Stir myStir = new Stir();
    
    public ArrayList<Player> getPlayers() {
        return Players;
    }

    public void setPlayers(ArrayList<Player> Players) {
        this.Players = Players;
    }

    public Stir getMyStir() {
        return myStir;
    }

    public void setMyStir(Stir myStir) {
        this.myStir = myStir;
    }
    
    
    public void startGame(ArrayList<Player> players, Stir myStir){
        this.setMyStir(myStir);
        this.setPlayers(players);
    }
    
    public void round(){
        boolean key = false;
        Player wetPlayer = new Player();
        while (!key){
            for (Player actualPlayer : this.getPlayers()){
            key = actualPlayer.shoot(this.myStir);
            
            if (key){
                wetPlayer = actualPlayer;
                break;}
            }
        }
        System.out.println(wetPlayer);
    }
}
