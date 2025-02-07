dimport java.util.Scanner;

public class java {
    public static void main (String[] args){

        Scanner myscan = new Scanner(System.in);

        System.out.println("Pick a number");

        int n = myscan.nextInt();

        for (int i = 1; i<=n; i++){
            int j = i*4;
            if (j%4==0){
                System.out.println(j);
            }
        }

       





    }
    
}
