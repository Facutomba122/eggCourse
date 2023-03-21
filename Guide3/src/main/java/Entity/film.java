package Entity;


public class film {
    String title;
    String director;
    double duration;
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public film() {
    }
    
    @Override
    public String toString(){
        return "Nombre de la pelicula: " + this.title + "\n" + "Nombre del directo: " + this.director + "\n" + "Duracion: " + Double.toString(this.duration);
    }
    
    public int compareTo(film otherFilm){
        return Double.compare(this.duration, otherFilm.getDuration());
    }
}
