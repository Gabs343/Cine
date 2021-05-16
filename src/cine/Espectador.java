package cine;

public class Espectador {
    private String nombre;
    private Integer edad;
    private Integer dinero;

    public Espectador(String nombre, Integer edad, Integer dinero){
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public void Descontar(Integer precio){
        dinero -= precio;
        System.out.println("Se desconto: " + precio + " al espectador: " + nombre);
    }

    public boolean tieneDinero(Integer precio){
        return dinero >= precio;
    }

    public boolean tieneEdad(Integer edadMinima){
        return edad >= edadMinima;
    }
}
