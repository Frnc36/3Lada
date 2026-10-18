package app;

import controller.Controller;
import model.Ladak;
import model.Lada;
import view.View;

public class Program {

    public static void main(String[] args) {
        Ladak ladak = new Ladak();
        View view = new View();
        Controller controller = new Controller(ladak, view);

    }
}
