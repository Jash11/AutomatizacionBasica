package LogicaPersonajes;

public class Mago extends Personaje {
    int poderMagico;
    int disminuirVelocidad;
    public Mago(String nombre, int nivel, int poderMagico, int disminuirVelocidad) {
        super(nombre, nivel);
        this.poderMagico = poderMagico;
        this.disminuirVelocidad = disminuirVelocidad;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("El mago lanza un hechizo y disminuye la velocidad del enemigo: "+disminuirVelocidad);
    }
}
