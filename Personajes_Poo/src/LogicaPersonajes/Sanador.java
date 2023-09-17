package LogicaPersonajes;

public class Sanador extends Personaje{
    int poderCurativo;
    int reducirDano;

    public Sanador(String nombre, int nivel, int poderCurativo, int reducirDano) {
        super(nombre, nivel);
        this.poderCurativo = poderCurativo;
        this.reducirDano = reducirDano;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("El sanador redujo el daño de su enemigo en: "+reducirDano);
    }
}
