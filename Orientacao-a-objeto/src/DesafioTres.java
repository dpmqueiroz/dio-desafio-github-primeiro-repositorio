import java.io.IOException;
import java.util.Scanner;

public class DesafioTres {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        for (int i = 1; i <= n; i++ ) {
            if ( n % i  == 0 ) System.out.println(i);
        }
    }
}
