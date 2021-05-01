import java.util.Scanner;

public class ParcelasComJuros {
    public static void main (String[] args) throws Exception {
        
        Scanner read = new Scanner(System.in);
        double valorCompra; int numParcelas; double parcelaSemJuros; 
        double parcelaComJuros; double jurosParcela;

        System.out.print("Insira o valor da compra: ");
        valorCompra = read.nextDouble();
        System.out.print("Insira a quantidade de prestações a pagar: ");
        numParcelas = read.nextInt();

        parcelaSemJuros = valorCompra / numParcelas;

        for (int i = 1; i <= numParcelas; i++) {
            jurosParcela = parcelaSemJuros * i/100;
            parcelaComJuros = parcelaSemJuros + jurosParcela;
            System.out.println("A " + i + "a prestação será de R$" + parcelaComJuros + 
            " e receberá R$" + jurosParcela + " de juros.");
            System.out.println();
        }

    }
}
