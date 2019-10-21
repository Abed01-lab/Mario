package mariospizza;

import java.util.Scanner;
import java.util.Collections;

public class Udføre {

    BestillingsListe bestillingsListe = new BestillingsListe();
    Omsætning omsætning = new Omsætning();
    Menu menu = new Menu();

    private void startText() {
        System.out.println("\nIndtast: ");
        System.out.println("1. Opret bestilling");
        System.out.println("2. Fjern en bestilling");
        System.out.println("3. Se Bestillings Liste");
        System.out.println("4. Se Menu");
        System.out.println("5. Se omsætning");

    }

    public void startProgram() {

        while (true) {

            startText();
            Scanner input = new Scanner(System.in);
            int swichInput = input.nextInt();

            switch (swichInput) {

                //Opret Ordre
                case 1:
                    System.out.println("Indtast pizza nr. for at tilføje.");
                    int pizzaNr = input.nextInt();
                    bestillingsListe.tilføj(menu.menu[pizzaNr - 1]);
                    omsætning.tilføj(menu.menu[pizzaNr - 1]);

                    System.out.println("Indtast afhentnings tidspunkt: sådan TTMM (1300)");
                    int afhentTid = input.nextInt();
                    menu.menu[pizzaNr - 1].afhentningsTid = afhentTid;
                    break;
                    
                //Fjern bestilling
                case 2:
                    bestillingsListe.printListe();
                    System.out.println("Indtast pizza nr for at fjerne");
                    int pizzaNr1 = input.nextInt();

                    bestillingsListe.fjern(pizzaNr1);
                    bestillingsListe.printListe();
                    break;

                //Print bestillingsListe
                case 3:
                    Collections.sort(bestillingsListe.bestillingsListe);
                    bestillingsListe.printListe();
                    break;

                //Print Menu
                case 4:
                    menu.arrayPrint();
                    break;
                    
                //Omsætning
                case 5:
                    omsætning.printListe();
                    omsætning.beregn();
                    
                    break;

            }
        }
    }
}
