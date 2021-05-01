import java.util.Scanner;

public class compras {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        double media; double totalDaCompra = 0; double maiorCompra = 0; double menorCompra = 0; double diferenca; double lucro;

        System.out.println("Digite o preço das suas 10 compras: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ".");
            double compraAtual = read.nextDouble();

            totalDaCompra = totalDaCompra + compraAtual;

            if (compraAtual > maiorCompra) {
                maiorCompra = compraAtual;
            }
            if (i == 1) {
                menorCompra = compraAtual;
            } else if (compraAtual < menorCompra) {
                menorCompra = compraAtual;
            }
    
        }

        media = totalDaCompra / 10;
        diferenca = maiorCompra - menorCompra;
        lucro = totalDaCompra * 1.3;

        System.out.println("A média de compra foi de R$" + media);
        System.out.println("A maior compra foi de R$" + maiorCompra + " e a menor foi de R$" + menorCompra);
        System.out.println("A diferença entre elas foi de R$" + diferenca);
        System.out.println("O lucro da empresa foi de R$" + lucro);


        
    }
}
