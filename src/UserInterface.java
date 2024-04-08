import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class UserInterface {
    Scanner sc = new Scanner(System.in);
    FileHandler fh = new FileHandler();
    String userInput = ""; //Skrives så man ikke skal instiancere den igen og igen

    public void sortData(){
        ArrayList<Covid19Data> data = fh.loadData();
        System.out.println("Her kan du sortere din data");
        System.out.println("Indtast 'region' for at sortere efter region");
        System.out.println("Indtast 'alder' for at sortere efter aldersgrupper");

        userInput = sc.next();
        if(userInput.equalsIgnoreCase("region")) {
            System.out.println("Hvis du vil tilføje en sekundær sorteringsmulighed?");
            System.out.println("Indtast 'alder' for aldersgrupper");
            System.out.println("Indtast 'ingen' for kun at sortere efter region");
            userInput = sc.next();
            if (userInput.equalsIgnoreCase("ingen")) {
            Collections.sort(data, new RegionComparator());
            System.out.println("Data sorteret efter region: ");}
            else if (userInput.equalsIgnoreCase("alder")) {
                //METODE TIL REGION, ALDER SORTERING
                Collections.sort(data, new RegionComparator().thenComparing(new AldersComparator()));
                System.out.println("Data sorteret efter region, og derefter alder: ");
                System.out.println();
            }
        } else if (userInput.equalsIgnoreCase("alder")) {
            System.out.println("Hvis du vil tilføje en sekundær sorteringsmulighed?");
            System.out.println("Indtast 'region' for regioner");
            System.out.println("Indtast 'ingen' for kun at sortere efter alder");
            userInput = sc.next();
            if (userInput.equalsIgnoreCase("ingen")) {
                Collections.sort(data, new AldersComparator());
                System.out.println("Data sorteret efter aldersgruppe: ");
            } else if (userInput.equalsIgnoreCase("region")) {
                //METODE TIL ALDER, REGION SORTERING
                Collections.sort(data, new AldersComparator().thenComparing(new RegionComparator()));
                System.out.println("Data sorteret efter alder, og derefter region: ");
                System.out.println();
            }
    } else {
        System.out.println("Ugyldigt input. Prøv igen.");
        return; // Afslutter metoden tidligt hvis input ikke er gyldigt
    }
    // Udskriver den sorterede data - kan det gøres i metoden i stedet?
    for (Covid19Data item : data) {
    System.out.println(item); }
    }
}