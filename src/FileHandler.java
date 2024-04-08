import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    public ArrayList<Covid19Data> loadData() {
        File file = new File("CovidData.csv");
        ArrayList<Covid19Data> totalData = new ArrayList();
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            //sc.nextLine();  // Skip første linje

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Covid19Data data = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();    // Split linje og læg tokens i attributter
            String[] attributes = line.split(";");
            data = new Covid19Data(
                    attributes[0], // region
                    attributes[1], // aldersgruppe
                    (Integer.parseInt(attributes[2])), // bekræftedeTilfældeIAlt
                    (Integer.parseInt(attributes[3])), //døde
                    (Integer.parseInt(attributes[4])), //indlagtePåIntensiv
                    (Integer.parseInt(attributes[5])), //indlagte
                    attributes[6] //dato
            );

            totalData.add(data);
            //System.out.println(data.toString());

        }
        sc.close();
        return totalData;
    }
}
