package cine;

public class Asiento {
    private final char columna;
    private final Integer fila;
    private boolean ocupado = false;
    private Espectador espectador;

    public Asiento(Integer fila, char columna){
        this.fila = fila;
        this.columna = columna;
        this.espectador = null;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
        ocupado = true;
    }

    public boolean Ocupado(){
        return ocupado;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "columna=" + columna +
                ", fila=" + fila +
                ", ocupado=" + ocupado +
                '}';
    }
}
