import java.util.Scanner;
public class first_multiple_of_5_and_7 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=1;
        while(true){
            if(n%5==0 && n%7==0){
                System.out.println("Number is :"+n);
                break;
            }
            n++;
        }
    }
}