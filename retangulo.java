import java.util.Scanner;

public class retangulo {
    public static void main (String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        
        System.out.println("Digite os lados do retângulo: ");
        System.out.print("lado 1 --> ");
        int lado1 = read.nextInt();
        System.out.print("lado 2 --> ");
        int lado2 = read.nextInt();

        System.out.println();

        for (int i = 0; i < lado1; i++) {
            for (int j = 0; j < lado2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
