import java.util.Scanner;

public class foobar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i%2==0)  System.out.println("foo " + i);
        else System.out.println("bar " + i);
    }
}
