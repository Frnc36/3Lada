package controller;

import java.util.Scanner;
import model.Ladak;
import model.Lada;
import view.View;

public class Controller {

    //C(M, V)
    private Ladak ladak;
    private View view;
    private Scanner scanner;

    public Controller(Ladak ladak, View view) {
        this.ladak = ladak;
        this.view = view;
        this.scanner = new Scanner(System.in);
        
        view.kiir(ladak);
        
        System.out.println("Melyikben van a kincs?");
        System.out.print("Add számát: ");
        int valasztas = scanner.nextInt();
    }

}
