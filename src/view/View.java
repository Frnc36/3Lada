package view;

import model.Lada;
import model.Ladak;

public class View {

    public void kiir(Ladak ladak) {
        for (Lada lada : ladak.getLadak()) {
            System.out.printf("%s. %s láda mondja: %s %n", lada.getId(), lada.getSzin(), lada.getFelirat());
        }
    }

    public void kiirElTalatad() {
        System.out.println("Ebben volt a kincs!");
    }

    public void kiirNemTalatad() {
        System.out.println("Nem ebben volt a kincs!");
    }
    
    public void udvozloUzenet(){
        System.out.println("A 3 láda közül csak az egyiknek van kincse.");
    }

}
