import java.util.Scanner;
public class Natural_nos_Except_Multiple_of_given_no {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter till which number you want to check:");
        int num=s.nextInt();
        System.out.println("Enter the Number of which you dont want Divisibility:");
        int n=s.nextInt();
        int a=1;
        for(int i=1;i<=num;i++){
            if(i%n==0){
                continue;
            }
            System.out.println(i);
        }
    }
}