package mariospizza;

import java.util.ArrayList;

public class BestillingsListe {

    ArrayList<Pizza> bestillingsListe = new ArrayList<Pizza>();
    ArrayList<Pizza> omsætningsListe = new ArrayList<Pizza>();


    void tilføj(Pizza pizza) {
        bestillingsListe.add(pizza);
    }

    void fjern(int i) {
        bestillingsListe.remove(i - 1);
    }

    void printListe() {
        if (bestillingsListe.size() != 0) {
            int i = 0;
            for (Pizza pizza : bestillingsListe) {
                i++;
                System.out.println(i + ". Pizza: " + pizza.getPizzaNavn() + ", afhentnignstid: KL " + pizza.getAfhentingsTid());
            }
        } else {
            System.out.println("Ingen bestillinger...");
        }
    }
}
