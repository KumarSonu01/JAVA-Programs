import java.util.Scanner;
public class Ternary_operator_odd_even {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=s.nextInt();
        String ans;
        ans=(num%2==0)?"Even":"Odd";
        System.out.println(ans);
    }
}
