package kolekcje;

import java.util.Collection;
import java.util.Iterator;

//  transportowa firma
public class Transporting {
    Collection<Autobus> pojazdy;

    public Transporting(Collection<Autobus> vehicles) {
        this.pojazdy = vehicles;
    }

    public int liczTransportZysk(int pasazerowie, int odleglosc){
        int zysk = 0;
        int koszt = 0;

        for (Autobus a : pojazdy){
            zysk += a.liczZysk(pasazerowie);
            koszt += a.liczKoszt(odleglosc);
        }
        return zysk - koszt;
    }

}
