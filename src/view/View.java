package view;

import model.Lada;
import model.Ladak;

public class View {

    public void kiir(Ladak ladak) {
        for (Lada lada : ladak.getLadak()) {
            System.out.printf("| %s | %s | %s | %s |%n",lada.getId(), lada.getSzin(), lada.getFelirat(), lada.isVanKulcs());
        }
    }
}
