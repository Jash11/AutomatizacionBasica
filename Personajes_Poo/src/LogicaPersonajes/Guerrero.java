package LogicaPersonajes;

public class Guerrero extends Personaje{
    int infringirDano;
    int aumentarVelocidad;

    public Guerrero(String nombre, int nivel, int infringirDano, int aumentarVelocidad) {
        super(nombre, nivel);
        this.infringirDano = infringirDano;
        this.aumentarVelocidad = aumentarVelocidad;

    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("El guerrero infringe daño a su enemigo en: "+infringirDano);
    }
}
