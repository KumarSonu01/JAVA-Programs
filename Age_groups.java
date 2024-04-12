import java.util.Scanner;
public class Age_groups {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=s.nextInt();
        if(age<12){
            System.out.println("Child");
        }
        else if(age>=12 || age<=18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        }
    }
}
