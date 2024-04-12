import java.util.Scanner;
public class sum_of_natural_nos_without_loop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter till which natural no. you want to add");
        int n=s.nextInt();
        int sum=n*(n+1)/2;
        System.out.println("Sum is: "+sum);
    }
}
