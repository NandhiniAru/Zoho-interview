import java.util.*;
class SnakeMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int input = sc.nextInt();
	      int k=0;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <= (2 * input) - i; j++) {
                if (j <= input- i) 
                {
                 System.out.print(" ");  
                } else if (i % 2 == 1)
                {
                    k++;
                    System.out.print(k);
                } else 
                {
                    System.out.print(k);
                    k--; 
                }
            }
	    k=k+input;
	    System.out.println(" ");
        }

    }
}
