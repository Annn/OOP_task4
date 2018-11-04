package kolekcje;

public class Samochod {
    private int zuzyciePaliwa;
    private int przebieg;
    private int paliwo;

    public Samochod(int zyzycie, int przebieg, int paliwo){
        this.zuzyciePaliwa = zyzycie;
        this.przebieg = przebieg;
        this.paliwo = paliwo;
    }
    public Samochod(){}

//    getters
    public int getZuzyciePaliwa() { return zuzyciePaliwa; }
    public int getPrzebieg() { return przebieg; }
    public int getPaliwo() { return paliwo; }


    //metoda tankująca Samochod
    public void tankuj(int paliwo){
        this.paliwo += paliwo;
    }

    //metoda obliczająca koszt podrozy samochodem na trasie o podanej dlugosci
    public int liczKoszt(int odleglosc){
        return zuzyciePaliwa * odleglosc;
    }

    @Override
    public String toString(){
        return zuzyciePaliwa + "\t" + przebieg + "\t" + paliwo;
    }
}