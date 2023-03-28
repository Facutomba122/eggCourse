package Entity;


public class Student {
    String fullname;
    int DNI;
    Votes votes;
    

    public Student() {
    }
    
    public Student(String fullname, int DNI, Votes votes) {
        this.fullname = fullname;
        this.DNI = DNI;
        this.votes = votes;
    }
    
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Student{" + "fullname=" + fullname + ", DNI=" + DNI + ", votes=" + votes + '}';
    }

   
    
}
