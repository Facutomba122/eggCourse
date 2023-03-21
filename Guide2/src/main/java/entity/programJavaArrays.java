package entity;
import java.util.Arrays;

public class programJavaArrays {
    
    public static double[] main(String[] args){
        double[] array1 = new double[50];
        double[] array2 = new double[20];
        
        for (int i=0; i < 50; i++){
            array1[i] = Math.random() * 10;
        }
        
        Arrays.sort(array1);
        
        for (int i=0; i< 20; i++){
            if (i< 10){
                array2[i] = array1[i];
            } else {
                array2[i] = 0.5;
            }
        }
        return array2;
    }
}
