package library;

public class MineralFinder {

	public static void main(String[] args) {

		ParametrosPesquisa mineralPesquisado = new ParametrosPesquisa();
		ConsultaMinerio consultaMinerio = new ConsultaMinerio();

		mineralPesquisado.definirCor();
		mineralPesquisado.definirDureza();
		mineralPesquisado.definirDensidade();
		consultaMinerio.consultaCor(mineralPesquisado.cor);
		consultaMinerio.consultaDureza(consultaMinerio.indexDureza, mineralPesquisado.durezaMinimaMinerio, mineralPesquisado.durezaMaximaMinerio);
		consultaMinerio.consultaDensidade(mineralPesquisado.densidadeMinimaMinerio, mineralPesquisado.densidadeMaximaMinerio);

	}
}
