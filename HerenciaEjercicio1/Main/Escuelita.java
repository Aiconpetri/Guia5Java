package Main;


import EntidadesHijas.Caballo;
import EntidadesHijas.Gato;
import EntidadesHijas.Perro;

public class Escuelita {

    public static void main(String[] args) {
        Perro p1 = new Perro("Thiano", "Croquetas", 5, "Callejero");
        p1.alimentarse();
        Perro p2 = new Perro("Iron", "Galletas", 10, "RottWeiler");
        p2.alimentarse();
        Gato g1 = new Gato("Sol", "Pescado", 8, "Bombay");
        g1.alimentarse();
        Caballo c1 = new Caballo("Waldo", "Heno", 7, "Arabe");
        c1.alimentarse();
    }
}
