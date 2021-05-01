import java.util.Scanner;

public class iap {
    public static void main (String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        int idade; double altura; double peso;
        int maisDe50anos = 0; int entre1e2m = 0; int menosDe40kg = 0;

        for (int i = 0; i < 5; i++) {
            
            System.out.println("- Digite as informações da " + (i + 1) + "a pessoa -");
            System.out.print("Idade: ");
            idade = read.nextInt();
            System.out.print("Altura: ");
            altura = read.nextDouble();
            System.out.print("Peso: ");
            peso = read.nextDouble();

            if (idade > 50) {
                maisDe50anos++;
            }
            if (altura > 1 && altura < 2) {
                entre1e2m++;
            }
            if (peso < 40) {
                menosDe40kg++;
            }

            System.out.println();

        }

        System.out.println(maisDe50anos + " dessas pessoas têm mais de 50 anos.");
        System.out.println(entre1e2m + " dessas pessoas têm entre 1 e 2 metros.");
        System.out.println(menosDe40kg + " dessas pessoas têm menos de 40 kg.");
    }
}
