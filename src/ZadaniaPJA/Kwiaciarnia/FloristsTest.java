package ZadaniaPJA.Kwiaciarnia;

/**
 * Created by Marek on 2017-06-28.
 */
public class FloristsTest {

    public static void main(String[] args) {
        // Kwiaciarnia samoobsługowa
        // ustalenie cennika
        PriceList pl = PriceList.getInstance();
        pl.put("róża", 10.0);
        pl.put("bez", 12.0);
        pl.put("piwonia", 8.0);

        // Przychodzi klient janek. Ma 200 zł
        Customer janek = new Customer("Janek", 200);

        // Bierze różne kwiaty: 5 róż, 5 piwonii, 3 frezje, 3 bzy
        janek.get(new Rose(5));
        janek.get(new Peony(5));
        janek.get(new Freesia(3));
        janek.get(new Lilac(3));

    }
}
