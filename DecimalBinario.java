import java.util.Scanner;
public class DecimalBinario {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        float x = input.nextInt();
        float cociente;
        float resto;
        do { 
            cociente = x/2;
            resto = cociente%2;
            System.out.println("secuencia " + resto);
            x = cociente;
        } while (cociente<=0);
        System.out.println("enough");
        
            
           

    }
    
}
