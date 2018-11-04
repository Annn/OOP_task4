package kolekcje;

import org.junit.Test;

import static org.junit.Assert.*;


public class SamochodTest {

    @Test
    public void liczKoszt() {
        Samochod golf = new Samochod(4, 50000, 50);
        int kosztAktualny = golf.liczKoszt(30);
        int  kosztOczekiwany = 120;
        assertEquals(kosztOczekiwany, kosztAktualny, 0);
    }
}