public class java_2 {
    public static void main (String[] args){
        int x = 0;
        
        for (int i=0 ; i <100; i++){
            int j = x%2;
            int k = x%3;

            if (j==0){

                if (k!=0){
                    System.out.println(x);
                }
            }
            else{
            }

            x = x+1;
        }

    }  
    
}
