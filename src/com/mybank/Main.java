package com.mybank;
import cine.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cine cine = new Cine(new Sala(3, 4, 500));
        cine.getSala().setPelicula(new Pelicula("Avengers", 150, 12, new Director("Russel")));
        Espectador esp = new Espectador("Gabs", 25, 750);
        cine.getSala().Sentar(esp, 1, 'C');

        cine.getSala().mostrarAsientos();
    }
}
