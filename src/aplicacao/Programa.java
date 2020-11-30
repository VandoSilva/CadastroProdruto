package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o produto");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Preco: ");
		double preco = sc.nextDouble();
		Produtos produto = new Produtos(nome, preco);
		
		produto.setNome("Computador");
		System.out.println("Nome atualizado " + produto.getNome());
		produto.setPreco(12000);
		System.out.println("Preco Atualizado " + produto.getPreco());
		
		
		System.out.println();
		System.out.println("Data do Produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produtos que vai ser adicionado no estoque");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produtos que retirados do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);

		
		sc.close();
		
		

	}

}
