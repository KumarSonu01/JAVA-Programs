import java.util.Scanner;
public class even_divisible_by_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=s.nextInt();
        if(n%2==0 && n%3==0){
            System.out.println("Number is Even and divisible by 3");
        }
        else{
            System.out.println("Woops!Try Again..!!");
        }
    }
}
