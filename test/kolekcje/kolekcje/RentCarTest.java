package kolekcje;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class RentCarTest {
    RentCar rent;
    Samochod test;

    @Before public void initialize() {
        Collection<Samochod> carCollection = new ArrayList<>();
        carCollection.add(new Samochod(4, 50000, 50));
        carCollection.add(new Samochod(8, 100000, 80));
        rent = new RentCar(carCollection);
        test = new Samochod(5, 10000, 5);
    }
    @Test
    public void liczZestawienie() {

    }

    @Test
    public void kupPojazd() {
        rent.kupPojazd(test);
    }

    @Test
    public void sprzedajPojazd() {
        rent.sprzedajPojazd(test);
    }
}