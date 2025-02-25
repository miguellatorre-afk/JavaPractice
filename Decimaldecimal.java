import java.util.Scanner;
public class Decimaldecimal {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String label = input.nextLine();
        
        switch (label) {

            case "1": 
            double x = input.nextDouble();
            double cociente; 
            double resto;
            do { 
                cociente = x/2;
                resto = x%2;
                System.out.println("secuencia " + resto);
                x = cociente;

            } while (cociente>1);
                break;

            case "2":
                String decimal = input.next();
              

                String newtext = new StringBuilder(decimal).reverse().toString();
                System.out.println(newtext);

                double binario = 0;
                for (int i = 0; i < newtext.length(); i++) {

                    char undigit = newtext.charAt(i);
                    int  digit = Character.getNumericValue(undigit);


                    double digitconverted = digit * Math.pow(2, i);
                    binario = binario + digitconverted; 
                }
                System.out.println(binario);
                break;

            case "3":
            


            default:
                System.out.println("error");
                break;


        }
        
            
           

    }
    
}
