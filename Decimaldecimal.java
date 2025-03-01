import java.util.Scanner;
public class Decimaldecimal {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String label = input.nextLine();
        
        switch (label) {

            case "1" -> { 
                double x = input.nextDouble();
                double cociente; 
                double resto;
                System.out.println("no te olvides de leerlo de derecha a izquierda");
                do { 
                    cociente = x/2;
                    resto = x%2;
                    int resultado = (int)resto;
                    System.out.print(resultado);
                    x = cociente;

                } while (cociente>1);
            }

            case "2" -> {
                String decimal = input.next();
                String reversetext = new StringBuilder(decimal).reverse().toString();
                double result = 0;
                for (int i = 0; i < reversetext.length(); i++) {
                    char undigit = reversetext.charAt(i);
                    int  digit = Character.getNumericValue(undigit);
                    if(digit==1 || digit ==0){
                        double digitconverted = digit * Math.pow(2, i);
                        result = result + digitconverted; 
                    }else{
                        System.out.println("not accepted");
                        break;
                    }
                  
                }
                System.out.println(result);
            }
                
            default -> System.out.println("error");


        }
        
        input.close();
           

    }
    
}
