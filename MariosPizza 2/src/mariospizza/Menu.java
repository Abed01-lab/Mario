package mariospizza;

public class Menu {

    Pizza vesuvio = new Pizza("Vesuvio", 1, 57);
    Pizza amerikaner = new Pizza("Amerikaner", 2, 53);
    Pizza cacciatore = new Pizza("cacciatore", 3, 57);
    Pizza carbona = new Pizza("Carbona", 4, 63);
    Pizza dennis = new Pizza("Dennis", 5, 65);
    Pizza bertil = new Pizza("Bertil", 6, 57);
    Pizza silvia = new Pizza("Silvia", 7, 61);
    Pizza victoria = new Pizza("Victoria", 8, 61);
    Pizza toronfo = new Pizza("Toronfo", 9, 61);
    Pizza capricciosa = new Pizza("Capricciosa", 10, 61);
    Pizza hawai = new Pizza("Hawai", 11, 61);
    Pizza leBlissola = new Pizza("Le Blissola", 12, 61);
    Pizza venezia = new Pizza("Venezia", 13, 61);
    Pizza mafia = new Pizza("Mafia", 14, 61);

    Pizza[] menu = {vesuvio, amerikaner, cacciatore, carbona, dennis, bertil, silvia, victoria, toronfo, capricciosa, hawai, leBlissola, venezia, mafia};

    public void arrayPrint() {
        for (Pizza pizza : menu) {
            System.out.println(pizza.toString());
        }
    }

}
