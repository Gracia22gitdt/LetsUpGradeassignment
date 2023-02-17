import java.util.Scanner;
public class positiveNumber {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ant number: ");
        int n = sc.nextInt(); 

        if(n>=0)
        {
            System.out.println("The Number is positive");
        }else
        {
            System.out.println("The number is negaive");
        }
    }  
}
