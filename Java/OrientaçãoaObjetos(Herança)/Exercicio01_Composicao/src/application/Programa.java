package application;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoProduto;
import entities.Produto;
import entities.enums.OrderStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Pedido pedido;

        System.out.println("Digite os dados do cliente");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento(dd/MM/yyyy): ");
        String data = sc.nextLine();

        LocalDate datadeNascimento = LocalDate.parse(data,fmt);

        System.out.println("\nDigite os dados do pedido");
        System.out.print("Status: ");
        String status = sc.nextLine();
        LocalDateTime momentodoPedido = LocalDateTime.now();

        pedido = new Pedido(momentodoPedido, OrderStatus.valueOf(status), new Cliente(nome, email, datadeNascimento));

        System.out.print("Quantos items há neste pedido: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("\nDigite os dados o %dº item\n", i+1);
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            PedidoProduto produto = new PedidoProduto(new Produto(nomeProduto, preco), quantidade);
            pedido.addItem(produto);
        }

        System.out.println(pedido);
        sc.close();
    }
}
