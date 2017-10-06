package library;

import java.util.Scanner;

public class ParametrosPesquisa {

	double durezaMinimaMinerio;
	double densidadeMinimaMinerio;
	double durezaMaximaMinerio;
	double densidadeMaximaMinerio;
	String cor;

	private Scanner scanner;

	public void definirCor() {

		scanner = new Scanner(System.in);
		OpcoesCor opcoes = new OpcoesCor();

		System.out.println("Cor do minério");
		opcoes.adicionarCores();
		opcoes.listarCores();

		int opcao = scanner.nextInt() - 1;
		cor = (opcoes.cor.get(opcao));
	}

	public void definirDureza() {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Dureza mínima do minério");
		durezaMinimaMinerio = scanner.nextDouble();
		System.out.println(durezaMinimaMinerio);

		System.out.println("Dureza máxima do minério");
		durezaMaximaMinerio = scanner.nextDouble();
		System.out.println(durezaMaximaMinerio);

	}

	public void definirDensidade() {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Densidade mínima do minério");
		densidadeMinimaMinerio = scanner.nextDouble();

		System.out.println("Densidade máxima do minério");
		densidadeMaximaMinerio = scanner.nextDouble();
	}
	
}
