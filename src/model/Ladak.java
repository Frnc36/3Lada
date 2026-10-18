package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ladak {

    private List<Lada> ladak = new ArrayList<>();

    public Ladak() {
        feltolt();
    }

    Lada arany = new Lada(1, "Arany", "Nálam van");
    Lada ezust = new Lada(2, "Ezüst", "Nincs nálam");
    Lada bronze = new Lada(3, "Bronz", "Arany hazudik");

    private void feltolt() {
        ladak.add(arany);
        ladak.add(ezust);
        ladak.add(bronze);
    }

    public List<Lada> getLadak() {
        return Collections.unmodifiableList(ladak);
    }
}
