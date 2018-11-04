package kolekcje;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class AutobusTest {
    Autobus autobus;
    @Before
    public void initialize(){
        autobus = new Autobus(15, 120000, 50, 80, "merc", 60);
    }

    @Test
    public void liczZysk() {
        int zyskAktualny = autobus.liczZysk(80);
        int  zyskOczekiwany = 4800;
        assertEquals(zyskOczekiwany, zyskAktualny, 0);
    }

    @Test
    public void liczKoszt() {
        int kosztAktualny = autobus.liczKoszt(300);
        int  kosztOczekiwany = 4500;
        assertEquals(kosztOczekiwany, kosztAktualny, 0);
    }
}