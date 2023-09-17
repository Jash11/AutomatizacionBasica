package LogicaPersonajes;

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;

    public Personaje(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;

        puntosVida = nivel*100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void atacar(){
    }

}
