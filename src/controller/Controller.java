package controller;

import java.util.Scanner;
import model.Ladak;
import view.View;

public class Controller {

    private Ladak ladak;
    private View view;
    private Scanner scanner;

    public Controller(Ladak ladak, View view) {
        this.ladak = ladak;
        this.view = view;
        this.scanner = new Scanner(System.in);

        view.udvozloUzenet();
        view.kiir(ladak);

        System.out.println("Melyikben van a kincs?");
        System.out.print("Add sor számát: ");
        int valasztas = scanner.nextInt();
        bekeresEllenorzes(valasztas);
        tippEllenorzes(valasztas);
    }

    private void tippEllenorzes(int valasztas) {
        if (valasztas == 2) {
            view.kiirElTalatad();
        } else {
            view.kiirNemTalatad();
        }
    }

    private void bekeresEllenorzes(int valasztas) {
        while ((!(valasztas <= 3 && valasztas >= 1))) {
            System.out.print("Rossz szám ad meg újra (1-3): ");
            valasztas = scanner.nextInt();
        }
    }

}
