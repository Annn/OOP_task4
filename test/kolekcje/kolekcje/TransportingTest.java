package kolekcje;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class TransportingTest {
    Transporting transp;

    @Before
    public void initialize() {
        Collection<Autobus> autobusy = new ArrayList<>();
        Autobus a1 = new Autobus(15, 30000, 30, 150, "mers", 30);
        Autobus a2 = new Autobus(20, 10000, 50, 160, "setra", 50);
        ((ArrayList<Autobus>) autobusy).add(a1);
        ((ArrayList<Autobus>) autobusy).add(a2);
        transp = new Transporting(autobusy);
    }

    @Test
    public void liczTransportZysk() {
        int zyskAktualny = transp.liczTransportZysk(150, 300); // 4500 + 7500 - 4500 - 6000 = 0
        int zyskOczekiwany = 1500;
//        System.out.println(zyskAktualny);
        assertEquals(zyskOczekiwany, zyskAktualny, 0);
    }
}