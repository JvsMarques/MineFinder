package library;

import java.util.ArrayList;
import java.util.List;

public class ConsultaMinerio {

    DadosReader dadosReader = new DadosReader();
    List<Integer> indexDureza = new ArrayList<>();
    List<Integer> indexDensidade = new ArrayList<>();

    public void consultaCor(String corPesquisada) {

        dadosReader.readerCor();

        for (int i = 0; i < dadosReader.cor.size(); i++) {
            String[] listaCor = dadosReader.cor.get(i);
            for (int j = 0; j < listaCor.length; j++) {
                if (listaCor[j].equals(corPesquisada)) {
                    indexDureza.add(i);
                }
            }
        }
    }


    public void consultaDureza(List index, double durezaMinima, double durezaMaxima) {

        dadosReader.readerDureza();

        System.out.println("----------------");
        System.out.println("DUREZA");

        for (int i = 0; i < index.size(); i++) {

            String[] teste = dadosReader.dureza.get(indexDureza.get(i));
            String string = teste[0].replace(',', '.');
            double durezaPesquisada = Double.parseDouble(string);
            if (durezaPesquisada < durezaMaxima && durezaPesquisada > durezaMinima) {

                System.out.print(durezaPesquisada + "---");
                indexDensidade.add(i);

            }
        }
    }


    public void consultaDensidade(double densidadeMinimaMinerio, double densidadeMaximaMinerio) {

        dadosReader.readerDensidade();

        System.out.println("----------------");
        System.out.println("DENSIDADE");

        for (int i = 0; i < dadosReader.densidade.size(); i++) {
            String[] teste = dadosReader.dureza.get(i);
            String string = teste[0].replace(',', '.');
            double densidadePesquisada = Double.parseDouble(string);
            if (densidadePesquisada < densidadeMaximaMinerio && densidadePesquisada > densidadeMinimaMinerio) {

                System.out.println(densidadePesquisada);

            }
        }
    }
}