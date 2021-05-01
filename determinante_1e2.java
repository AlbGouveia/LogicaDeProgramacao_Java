import java.util.Scanner;
import java.util.Random;

public class determinante {
    public static void main (String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int sinal;
        int aleatorio;
        int matriz;
        int diagP = 1; int diagP2 = 1; int diagP3 = 1;
        int diagS = 1; int diagS2 = 1; int diagS3 = 1;
        int dt = 0;

        System.out.println();

        System.out.print("Digite o tamanha da matriz (2 ou 3): ");
        matriz = read.nextInt();

        for (int i = 1; i <= matriz; i++) {
            for (int j = 1; j <= matriz; j++) {
                sinal = 1 + random.nextInt(1);
                if (sinal == 1) {
                    sinal = 1;
                    System.out.print(" ");
                } else {
                    sinal = -1;
                }

                aleatorio = (1 + random.nextInt(9)) * sinal;
                System.out.print(aleatorio + " ");

                switch (matriz) {
                    case 2:
                        if (i == j) {
                            diagP *= aleatorio; 
                        } else {
                            diagS *= aleatorio;
                        }
                        break;
                    case 3:
                        if (i == j) {
                            diagP *= aleatorio;
                        }
                        if (i == (j - 1) || i == (j + 2)) {
                            diagP2 *= aleatorio; 
                        }
                        if (i == (j - 2) || i == (j + 1)) {
                            diagP3 *= aleatorio;
                        }
                        if ((i == 2 && j == 2) || (i == (j - 2)) || (i == (j + 2))) {
                            diagS *= aleatorio;
                        }
                        if ((i == 3 && j == 2) || (i == 2 && j == 3) || (i == 1 && j == 1)) {
                            diagS2 *= aleatorio;
                        } 
                        if ((i == 3 && j == 3) || (i == 2 && j == 1) || (i == 1 && j == 2)) {
                            diagS3 *= aleatorio;
                        }
                        break;
                    default:
                        System.out.println("Valor de matriz inválido!");
                        break;
                }

            }
            System.out.println();
        }
        switch (matriz) {
            case 2:
                dt = diagP - diagS;
                break;
            case 3:
                System.out.println(diagP + " " + diagP2 + " " + diagP3 + " " + diagS + " " + diagS2 + " " + diagS3);
                dt = diagP + diagP2 + diagP3 - diagS - diagS2 - diagS3;
        }
        System.out.println("O determinante de matriz é " + dt);
    }
}
