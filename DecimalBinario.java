import java.util.Scanner;
public class DecimalBinario {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        float x = input.nextInt();
        float cociente;
        float resto;
        do { 
            cociente = x/2;
            resto = x%2;
            System.out.println("secuencia " + resto + "    " + cociente);
            x = cociente;
        } while (cociente>1);

        System.out.println("enough");
        
            
           

    }
    
}
