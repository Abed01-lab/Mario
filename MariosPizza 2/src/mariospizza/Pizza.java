package mariospizza;

public class Pizza implements Comparable{

    String pizzaNavn;
    int afhentningsTid;
    int pizzaNr;
    int pris;

    public Pizza(String pizzaNavn, int pizzaNr, int pris) {
        this.pizzaNavn = pizzaNavn;
        this.pizzaNr = pizzaNr;
        this.pris = pris;

    }

    public int getPris() {
        return pris;
    }

    public String getPizzaNavn() {
        return pizzaNavn;
    }

    public int getAfhentingsTid() {
        return afhentningsTid;
    }

    @Override
    public int compareTo(Object comparestu) {
        int compareTime = ((Pizza) comparestu).getAfhentingsTid();
        return this.afhentningsTid - compareTime;
    }

    @Override
    public String toString() {
        return "Nr: " + pizzaNr + ", Navn: " + pizzaNavn;
    }
    
}
