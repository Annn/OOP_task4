package kolekcje;

import java.util.Collection;

public interface Samochody {
    public int liczZestawienie(int odleglosc);

    public void kupPojazd(Samochod samochod);
    public void sprzedajPojazd(Samochod samochod);
}