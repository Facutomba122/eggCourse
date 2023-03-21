package Entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Cinema {
    String[][] cinema = new String[8][6];
    Movie actualMovie;
    double cost;
    ArrayList<Spectator> potencialSpectator = new ArrayList<>();
    
    public Cinema(ArrayList<Spectator> potencialSpectator, Movie actualMovie) {
        this.potencialSpectator = potencialSpectator;
        this.actualMovie = actualMovie;
    }
    
    public void fillCinema(){
        int i=0;
        int j=0;
        int saveCounter = 0;
        Arrays.fill(this.cinema, " ");
        
        for (Spectator auxSpectator : this.potencialSpectator ){
            while (!this.cinema[i][j].equals(" ") && saveCounter < 40){
                i = ThreadLocalRandom.current().nextInt(0, 8 + 1); // posible overflow, in that case change 8 for 7
                j = ThreadLocalRandom.current().nextInt(0, 6 + 1); // posible overflow, in that case change 6 for 5
            }
            if (auxSpectator.isLegal(this.actualMovie.minAge) && auxSpectator.enoughMoney(this.cost)){
                this.cinema[i][j] = "X";
                saveCounter++;
            }
            if (saveCounter >= 40){
                break;
            }
        }
        
        System.out.println(Arrays.deepToString(this.cinema));
    }
}
