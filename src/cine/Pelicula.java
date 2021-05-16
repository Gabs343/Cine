package cine;

public class Pelicula {
    private String titulo;
    private Integer duracion;
    private Integer edadMinima;
    private Director director;

    public Pelicula(String titulo, Integer duracion, Integer edadMinima, Director director){
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public Integer getEdadMinima(){
        return edadMinima;
    }
}
