package entity;

public class Cadena {
    public String text;
    public int longitud;

    public Cadena() {
    }

    public void setText(String text) {
        this.text = text;
        this.longitud = text.length();
    }
    
    public int vowelsCounter(){
        int length = this.text.length();
        String auxText = this.text.toLowerCase();
        int counterVowels = 0;
        for (int i=0; i<length; i++){
            if(auxText.charAt(i) == 'a' || auxText.charAt(i) == 'e' || auxText.charAt(i) == 'i' || auxText.charAt(i) == 'o' || auxText.charAt(i) == 'u'){
                counterVowels++;
            }
        }
        return counterVowels;
    }
    
    public String invertText(){
        StringBuilder auxText = new StringBuilder(this.text);
        return auxText.reverse().toString();
    }
    
    public int charRepeatedCounter(char charRepetead){
        int counterRepetead = 0;
        int length = this.text.length();
        
        for (int i=0; i<length; i++){
            if (this.text.charAt(i) == charRepetead){
                counterRepetead++; 
            }
        }
        return counterRepetead;
    }
    
    public boolean compareLength(String compareString){
        return this.text.length()>compareString.length();
    } 
    
    public String bindString(String newText){
        this.text = this.text.concat(newText);
        return this.text;
    }
    
    public String replaceA(char selectChar){
        String auxString = null;
        int length = this.text.length();
        
        for (int i=0; i < length; i++){
            if (this.text.charAt(i) == 'a'){
                auxString.concat(Character.toString(selectChar));
            } else {
                auxString.concat(Character.toString(this.text.charAt(i)));
            }
        }
        return auxString;
    }
    
    public boolean containChar(char charContained){
        int length = this.text.length();
        for (int i=0; i < length; i++){
            if (this.text.charAt(i) == charContained){
                return true;
            }
        }
        return false;
    }
}
