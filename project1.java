import java.util.Scanner ;

public class project1 {
    public static void main(String[] args) {
        Scanner value = new Scanner (System.in);

        System.out.print("Please enter first number:");
        int a = value.nextInt();

        
        System.out.print("Please enter second number:");
        int b = value.nextInt();
        
        
        System.out.print("Please enter third number:");
        int c = value.nextInt();
        
        if (a < b && a < c ) {
            if (b < c) {
                System.out.println("a < b < c");
            }else {
                System.out.println("a < c < b");                    
        }
    }
        else if (b < a && b < c ) {
            if (a < c){
                System.out.println("b < a < c");
            }else {
                System.out.println("b < c < a");            
            }
        }
        else  {
            if (a < b){
            System.out.println("c < a < b");
            }else {
                System.out.println("c < b < a");
            }
        }







    }
}