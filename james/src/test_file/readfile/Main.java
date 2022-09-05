package test_file.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\Module2\\src\\test_file\\readfile\\countries.csv"));
            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length;i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    private static void printCountry(List<String> country) {
        System.out.println( "Country [id= "
                + country.get(0)
                + ", code= " + country.get(1)
                + " , name=" + country.get(2)
                + "]");
    }
}
