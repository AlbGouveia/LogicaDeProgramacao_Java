import java.util.Scanner; import java.util.Random;

public class matriz {
    public static void main (String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int aleatorio;
        double soma = 0;
        double media;

        System.out.println();

        System.out.print("Digite o tamanho da matriz: ");
        int matriz = read.nextInt();

        System.out.println();

        for (int i = 0; i < matriz; i++) {
            for (int j = 0; j < matriz; j++) {
                aleatorio = 1 + random.nextInt(9);
                soma = soma + aleatorio;
                System.out.print(aleatorio + " ");
            }
            System.out.println();
        }

        System.out.println();

        media = soma / (matriz * matriz);
        System.out.println("A soma dos números da matriz é " + soma);
        System.out.println("A média dos números da matriz é " + media);
    }
}
