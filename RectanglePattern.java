import java.util.Scanner;
public class RectanglePattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Rows:");
        int r=s.nextInt();
        System.out.println("Enter Columns:");
        int c=s.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(i+j);
            }
            System.out.println("");
        }
    }
}
