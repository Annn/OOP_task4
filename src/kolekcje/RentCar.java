package kolekcje;

import java.util.Collection;
import java.util.Iterator;

public class RentCar implements Samochody {
    Collection<Samochod> cars;

    public RentCar(Collection<Samochod> samochody) {
        this.cars = samochody;
    }

    @Override
    public int liczZestawienie(Collection<Samochod> samochod) {
        int koszt = 0;
        for (Samochod s : samochod){
            koszt += s.liczKoszt();
        }
        return samochod.size();
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
