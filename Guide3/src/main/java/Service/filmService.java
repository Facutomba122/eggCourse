package Service;
import Entity.film;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class filmService {
    ArrayList<film> myMovies = new ArrayList<>();
    
    
    public filmService() {
        int choice=0;
        Scanner scanner = new Scanner(System.in);
        
        while (choice != 1){
            film newFilm = new film();
            System.out.println("Nombre de la pelicula: ");
            newFilm.setTitle(scanner.nextLine());
            System.out.println("Nombre del director: ");
            newFilm.setDirector(scanner.nextLine());
            System.out.println("Duracion: ");
            newFilm.setDuration(scanner.nextDouble());
            scanner.nextLine();
            
            myMovies.add(newFilm);
            
            System.out.println("Si desea salir, ingrese 1.");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
    
    public void showFilms(){
        for (film auxFilm : this.myMovies){
            System.out.println(auxFilm);
        }
    }
    
    public void showLargeFilms(){
         for (film auxFilm : this.myMovies){
             if (auxFilm.getDuration() >= 1){
                 System.out.println(auxFilm);
             }
         }
    }
    
}
