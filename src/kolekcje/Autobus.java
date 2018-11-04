package kolekcje;

public class Autobus extends Samochod {
    private int pojemnosc;
    private String nazwa;
    private int cenaBiletu;

    public Autobus(int zyzycie, int przebieg, int paliwo) {
        super(zyzycie, przebieg, paliwo);
    }
    public Autobus(int zyzycie, int przebieg, int paliwo, int pojemnosc, String nazwa, int cenaBiletu) {
        super(zyzycie, przebieg, paliwo);
        this.pojemnosc = pojemnosc;
        this.nazwa = nazwa;
        this.cenaBiletu = cenaBiletu;
    }

    //metoda liczy zysk dla podanej trasy
    public int liczZysk(int pasazerowie){
        return cenaBiletu * pasazerowie;
    }
    @Override
    public String toString(){
        return pojemnosc + "\t" + nazwa + "\t" + cenaBiletu;
    }
}