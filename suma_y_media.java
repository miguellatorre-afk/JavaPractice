import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner myscan = new Scanner(System.in);
        float p = 0;
        int c = 0;
        float ip = 0;

        for (int i = 0; i <= 10; i++) {
            
            float x = myscan.nextFloat();
            float w = x%2;

            if(w == 0){
                
                p= p + x;
            }

            else{
                c= c + 1;
                ip= ip + x;
            }
        }

        System.out.println("suma de pares: " + p);
        System.out.println("suma de impares: " + ip);
        System.out.println("media impares:" + ip/c);
        




    }

    
    
}
