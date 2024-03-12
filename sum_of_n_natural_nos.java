import java.util.Scanner;
public class sum_of_n_natural_nos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number till which you want to add:");
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The Sum till the  given number is:" +sum);
    }
}
