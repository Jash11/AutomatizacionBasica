package LogicaPersonajes;

public class Poo {
    public static void main(String[] args) {
        Mago mago = new Mago("Merlin",2,80,20);
        Guerrero guerrero = new Guerrero("Wallace",4,70,30);
        Sanador sanador = new Sanador("Gaelean",3, 40, 60);

        System.out.println("\nNombre de mago: "+mago.getNombre());
        System.out.println("Nivel de mago: "+mago.getNivel());
        System.out.println("Puntos de vida de mago: "+mago.getPuntosVida());
        mago.atacar();

        System.out.println("\nNombre de guerrero: "+guerrero.getNombre());
        System.out.println("Nivel de guerrero: "+guerrero.getNivel());
        System.out.println("Puntos de vida de guerrero: "+guerrero.getPuntosVida());
        guerrero.atacar();

        System.out.println("\nNombre de sanador: "+sanador.getNombre());
        System.out.println("Nivel de sanador: "+sanador.getNivel());
        System.out.println("Puntos de vida de sanador: "+sanador.getPuntosVida());
        sanador.atacar();
        System.out.println("\n");
        Personaje[] Personajes = new Personaje[3];
        Personajes [0] = mago;
        Personajes [1] = guerrero;
        Personajes [2] = sanador;
        System.out.println("\nMAGO");
        Personajes[0].atacar();
        System.out.println("\nGUERRERO");
        Personajes[1].atacar();
        System.out.println("\nSANADOR");
        Personajes[2].atacar();
    }
}
