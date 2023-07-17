import java.util.Scanner;
public class CheckBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        n = n>>m;
        if((n&1) == 1) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
        sc.close();
    }
}