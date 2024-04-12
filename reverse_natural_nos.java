import java.util.Scanner;
public class reverse_natural_nos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("From where you want to reverse the Natural number");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
