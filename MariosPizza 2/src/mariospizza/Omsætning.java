package mariospizza;

import java.util.ArrayList;

public class Omsætning {
    
    int vesuvio = 0;
    int amerikaner = 0;
    int cacciatore = 0;
    int carbona = 0;
    int dennis = 0;
    int bertil = 0;
    int silvia = 0;
    int victoria = 0;
    int toronfo = 0;
    int caprcciosa = 0;
    int hawai = 0;
    int leBlissola = 0;
    int venezia = 0;
    int mafia = 0;

    ArrayList<Pizza> omsætningsListe = new ArrayList<Pizza>();
    int sum = 0;

    public void beregn() {
        for (Pizza pizza : omsætningsListe) {
            sum += pizza.getPris();
        }
            System.out.println("Omsætning for idag: " + sum + "kr.");
    }

    public void tilføj(Pizza pizza) {
        omsætningsListe.add(pizza);
    }
    
    public void visPopulærPizza(){
        for (Pizza pizza:omsætningsListe){
            if (pizza.getPizzaNavn() == "Vesuvio") {vesuvio++;}
            else if (pizza.getPizzaNavn() == "Amerikaner") {amerikaner++;}
            else if (pizza.getPizzaNavn() == "Cacciatore") {cacciatore++;}
            else if (pizza.getPizzaNavn() == "Carbona") {carbona++;}
            else if (pizza.getPizzaNavn() == "Dennis") {dennis++;}
            else if (pizza.getPizzaNavn() == "Bertil") {bertil++;}
            else if (pizza.getPizzaNavn() == "Silvia") {silvia++;}
            else if (pizza.getPizzaNavn() == "Victoria") {victoria++;}
            else if (pizza.getPizzaNavn() == "Toronfo") {toronfo++;}
            else if (pizza.getPizzaNavn() == "Caprcciosa") {caprcciosa++;}
            else if (pizza.getPizzaNavn() == "Hawai") {hawai++;}
            else if (pizza.getPizzaNavn() == "Le Blissola") {leBlissola++;}
            else if (pizza.getPizzaNavn() == "Venezia") {venezia++;}
            else if (pizza.getPizzaNavn() == "Mafia") {mafia++;}
        }
        
        int[] a = {vesuvio, amerikaner, cacciatore, carbona, dennis, bertil, silvia, victoria, toronfo, caprcciosa, hawai, leBlissola, venezia, mafia};
        int biggestNr = 0;
        for (int nr: a) {
            if (nr > biggestNr)
                biggestNr = nr;
        }
        System.out.println("Biggest nr: " + biggestNr);
    }

    void printListe() {
        if (omsætningsListe.size() != 0) {
            int i = 0;
            for (Pizza pizza : omsætningsListe) {
                i++;
                System.out.println(i + ". Pizza: " + pizza.getPizzaNavn() + ", afhentnignstid: KL " + pizza.getAfhentingsTid());
            }
        } else {
            System.out.println("Ingen bestillinger...");
        }
    }
}
