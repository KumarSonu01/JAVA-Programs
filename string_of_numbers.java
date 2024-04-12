import java.util.Scanner;
public class string_of_numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Press -1 to stop  entering numbers");
        int n=s.nextInt();
        int sum=0;
        while(n!=-1){
            sum+=n;
            n=s.nextInt();
        }
        System.out.println(sum);
    }
}