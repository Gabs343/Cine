package cine;

public class Sala {
    private final Asiento[][] asientos;
    private Pelicula pelicula;
    private Integer precio;

    public Sala(Integer cantFilas, Integer cantColumnas, Integer precio){
        this.precio = precio;
        asientos = new Asiento[cantFilas][cantColumnas];
        generarAsientos();
    }

    public void setPelicula(Pelicula pelicula){
        this.pelicula = pelicula;
    }

    private void generarAsientos(){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                asientos[i][j] = new Asiento(i + 1, (char) ('A' + j));
            }
        }
    }

    public boolean hayAsiento(){
        boolean hayAsiento = false;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                if(asientos[i][j].Ocupado()){
                    hayAsiento = true;
                }
            }
        }
        return hayAsiento;
    }

    public boolean hayAsiento(Integer fila, char columna){
        return getAsiento(fila, columna).Ocupado();
    }

    public Asiento getAsiento(){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                if(asientos[i][j].Ocupado()){
                    return asientos[i][j];
                }
            }
        }
        return null;
    }

    public Asiento getAsiento(Integer fila, char columna){
        return asientos[fila - 1][columna - 'A'];
    }

    public boolean sePuedeEntrar(Espectador esp){
        return esp.tieneDinero(precio) && esp.tieneEdad(pelicula.getEdadMinima());
    }

    public void Sentar(Espectador esp){
        if(sePuedeEntrar(esp) && !hayAsiento()){
            getAsiento().setEspectador(esp);
            esp.Descontar(precio);
        }
    }

    public void Sentar(Espectador esp, Integer fila, char columna){
        if(sePuedeEntrar(esp) && !hayAsiento(fila, columna)){
            getAsiento(fila, columna).setEspectador(esp);
            esp.Descontar(precio);
        }
    }

    public void mostrarAsientos(){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.println(asientos[i][j].toString());
            }
        }
    }

}
