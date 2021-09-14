package JavaRevisions;

public class modtwo {
        public static void main(String[] args) throws Exception {
            int n = 128;
    
            while(n % 2 == 0){
    
                n = n/2;
                if(n == 1){
                    System.out.println("This number is a mod of 2");
                    System.exit(0);
                }
            }
    
            System.out.println("The number is NOT a mod of 2");
        }
    }
    
