
import java.util.Scanner;
public class caja_registradora {

    public static void main(String args[]){

        Scanner myscan = new Scanner(System.in);
        double y = myscan.nextDouble();
        int i = 0;

        while (y >= 10000) {
            y = y - 10000;
            i = i+1;
        }
        System.out.println("Billetes de 10000: " + i +"  "+ y);

        i = 0;
        while (y >= 5000) {
            i = i+1;
            y = y - 5000;

        }
        System.out.println("Billetes de 5000: " + i +"  "+ y);

        i = 0;
        while(y >= 2000){
            i = i+1;
            y= y - 2000;

        }
        System.out.println("Billetes de 2000: " + i +"  "+ y);

        i = 0;
        while(y >= 1000){
            i = i+1;
            y= y - 1000;

        }
        System.out.println("Billetes de 1000: " + i +"  "+ y);

        i = 0;
        while(y >= 500){
            i = i + 1;
            y= y - 500;
        }
        System.out.println("Billetes de 500: " + i +"  "+ y);

        i = 0;
        while(y >= 100){
            i = i + 1;
            y= y - 100;
        }
        System.out.println("Billetes de 100: " + i +"  "+ y);

        
    }
}
