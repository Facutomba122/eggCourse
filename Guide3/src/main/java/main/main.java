package main; 
import Service.filmService;


public class main {

    public static void main(String[] args) {
        filmService myFilmService = new filmService();
        myFilmService.showFilms();
        myFilmService.showLargeFilms();
    }
}
