import java.util.Scanner;
public class natural_no {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter till which number  you want to check the natural numbers:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        //Using While Loop
        int num=1;
        while(num<=n){
            System.out.println(num);
            num++;
        }
    }
}
