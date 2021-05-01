import java.util.Scanner;

public class Investimento {
    public static void main (String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        double capital; double taxa; int meses; double montante; double juros; double ganho;

        System.out.println("- Digite as informações abaixo -");
        System.out.print("Capital investido: ");
        capital = read.nextDouble();
        System.out.print("Taxa (em % ao mês): ");
        taxa = read.nextDouble() / 100;
        System.out.print("Tempo de investimento (em meses): ");
        meses = read.nextInt();

        juros = Math.pow(taxa, meses);
        montante = capital * Math.pow(1 + taxa, meses);
        ganho = montante - capital;
        

        System.out.println("O montante acumulado após o investimento de R$" + capital + " a uma taxa de " + taxa + 
        "% em um período de " + meses + " meses é: ");
        System.out.println("--> R$" + montante);
        System.out.print("Os juros acumulados são de " + (juros * 100) + "%. O que consiste em um ganho de R$" + ganho);

    }
}
