import java.util.Scanner;
public class first_multiple_of_two_numbers_using_For_loop {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1=s.nextInt();
        System.out.println("Enter Second Number");
        int num2=s.nextInt();
        for(int i=1;;i++){
            if(i%num1==0 && i%num2==0){
                System.out.println("Found Answer"+i);
                break;
            }
        }
    }
}