package library;

import java.util.ArrayList;

public class OpcoesCor {
	
	ArrayList<String> cor = new ArrayList<String>();
	
	public void adicionarCores() {
		cor.add("verde");
		cor.add("azul");
		cor.add("vermelho");
		cor.add("marrom");
		cor.add("preto");
		cor.add("amarelo");
		cor.add("laranja");
		cor.add("roxo");
		cor.add("verde");
		cor.add("delta");
	}
	
	public void listarCores() {
		for (int i = 0; i < cor.size(); i++) {
			int j = i+1;
			System.out.println(j + " " + cor.get(i));
			
		}
	}

}
