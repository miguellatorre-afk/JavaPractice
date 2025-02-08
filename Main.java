

public class Main {

    public static void main(String args[]){
        int x = -1;
        int u = 0;
        int j = 0;

        int a = -1;
        int d = 0 ;

        for (int i = 0; i<100 ; i++) {
            x= x+1;

            if (x%3 == 0){
                u = x;
                j = j+x;
                System.out.println(u);
            }
        }

        

        for (int i = 0; i<11 ; i++) {
            a = a+1;

            if (a%2 == 0){
                d = d+a;
            }
        }
    
        System.out.println(d);

    }

   
}
