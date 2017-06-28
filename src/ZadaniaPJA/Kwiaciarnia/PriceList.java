package ZadaniaPJA.Kwiaciarnia;

import java.util.HashMap;

/**
 * Created by Marek on 2017-06-29.
 */
public class PriceList {

    public HashMap cennik = new HashMap();

    public static PriceList getInstance() {
        return new PriceList();
    }

    public void put(String nazwa, double cena) {
        cennik.put(nazwa, cena);
    }


}
