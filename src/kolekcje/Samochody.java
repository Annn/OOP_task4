package kolekcje;

import java.util.Collection;

public interface Samochody {
    public int liczZestawienie(Collection<Samochod> samochod);

    public void kupPojazd(Samochod samochod);
    public void sprzedajPojazd(Samochod samochod);
}