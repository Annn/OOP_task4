package kolekcje;

import java.util.Collection;
import java.util.Iterator;

public class RentCar implements Samochody {
    Collection<Samochod> cars;

    public RentCar(Collection<Samochod> samochody) {
        this.cars = samochody;
    }

    @Override
    public int liczZestawienie(int odleglosc) {
        int maxKoszt = 0;
        int koszt = 0;
        for (Samochod s : cars){
            koszt = s.liczKoszt(odleglosc);
            if (koszt > maxKoszt){
                maxKoszt = koszt;
            }
        }
        return maxKoszt;
    }

    @Override
    public void kupPojazd(Samochod s) {
        this.cars.add(s);
        displayCars();
    }
    @Override
    public void sprzedajPojazd(Samochod s) {
        if (cars.isEmpty()){
            System.out.println("Nie ma samochodow do sprzedazy");
        }
        else {
            cars.remove(s);
        }
        displayCars();
    }

    public void displayCars(){
        Iterator itrCar = cars.iterator();
        while (itrCar.hasNext()) {
            System.out.println(itrCar.next());
        }
    }
}
