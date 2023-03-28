package Entity;

import java.util.ArrayList;

public class Votes {
    Student owner = new Student();
    ArrayList<Student> votes = new ArrayList<>();

    public Votes(Student owner, ArrayList<Student> votes) {
        this.owner = owner;
        this.votes = votes;
    }
    
    
    
}
