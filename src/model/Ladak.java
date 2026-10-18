package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ladak {

    private Lada lada;
    private List<Lada> ladak = new ArrayList<>();

    public Ladak(Lada lada) {
        this.lada = lada;
        feltolt();
    }

    Lada arany = new Lada("Arany", "Nálam van", false);
    Lada ezust = new Lada("Ezüst", "Nincs nálam", true);
    Lada bronze = new Lada("Bronze", "Arany hazudik", false);

    private void feltolt() {
        ladak.add(arany);
        ladak.add(ezust);
        ladak.add(bronze);
    }

    public List<Lada> getLadak() {
        return Collections.unmodifiableList(ladak);
    }
}
