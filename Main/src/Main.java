import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double precoUnitario;
        Integer quantitadeComprada;
        Double valorRecebido;

        System.out.print("Preco unitario do produto: ");
        precoUnitario = scanner.nextDouble();
        System.out.print("Quantidade comprada: ");
        quantitadeComprada = scanner.nextInt();
        System.out.print("Dinheiro recebido: ");
        valorRecebido = scanner.nextDouble();

        Double troco = valorRecebido - (precoUnitario * quantitadeComprada);
        System.out.printf("TROCO = %.2f%n ", troco);

        scanner.close();
    }
}
