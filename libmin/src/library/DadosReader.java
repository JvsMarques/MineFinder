package library;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.opencsv.CSVReader;

public class DadosReader {

    ArrayList<String[]> cor = new ArrayList<String[]>();
    ArrayList<String[]> dureza = new ArrayList<String[]>();
    ArrayList<String[]> densidade = new ArrayList<String[]>();

    public void readerCor() {

        String csvFile = "/home/jmarques/Documents/Cores.csv";

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                cor.add(line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readerDureza() {
        // TODO Auto-generated method stub
        String csvFile = "/home/jmarques/Documents/Dureza.csv";

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                dureza.add(line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readerDensidade() {

        // TODO Auto-generated method stub
        String csvFile = "/home/jmarques/Documents/Densidade.csv";

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                densidade.add(line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

