package Main;

import EntidadBisNieta.Hotel5Estrellas;
import EntidadesNietas.Camping;
import EntidadesNietas.Hotel4Estrellas;
import EntidadesNietas.Residencia;
import Servicios.ServicioCamping;
import Servicios.ServicioHotel;
import Servicios.ServicioHotel5Estrellas;
import Servicios.ServicioResidencia;
import java.util.ArrayList;
import java.util.Scanner;

public class HabboBitch {

    public static void main(String[] args) {
        int des;
        ServicioCamping sc= new ServicioCamping();
        ServicioResidencia sr=new ServicioResidencia();
        ServicioHotel sh=new ServicioHotel();
        ServicioHotel5Estrellas s5=new ServicioHotel5Estrellas();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Hotel5Estrellas> hoteles5 = new ArrayList<>();
        ArrayList<Hotel4Estrellas> hoteles4 = new ArrayList<>();
        ArrayList<Camping> campings = new ArrayList<>();
        ArrayList<Residencia> residencias = new ArrayList<>();
        Hotel5Estrellas h1 = new Hotel5Estrellas(4, 10, 50, 10, "Titan", 55, "A", 5, 30, 80, 5, 0, "Titanic", "Orlando 229", "Miami", "Jon Snow");
        Hotel4Estrellas h2 = new Hotel4Estrellas("Maleta", 30, "B", 4, 20, 40, 3, 0, "Tremebundo", "Melington 315", "Miami", "Fernando Torres");
        Hotel5Estrellas h3 = new Hotel5Estrellas(5, 15, 80, 15, "Caro Pepe", 60, "A", 5, 40, 105, 6, 0, "Tridente", "Orlando 456", "Miami", "Jaime Lanister");
        Hotel4Estrellas h4 = new Hotel4Estrellas("Mitomano", 25, "A", 4, 25, 25, 2, 0, "Turbulencia", "Melington 784", "Miami", "Jordi Alba");
        Hotel5Estrellas h5 = new Hotel5Estrellas(5, 12, 50, 12, "BlackShip", 60, "A", 5, 35, 90, 5, 0, "Tornado", "Orlando 689", "Miami", "Arya Stark");
        Hotel4Estrellas h6 = new Hotel4Estrellas("Manantial", 40, "B", 4, 22, 45, 2, 0, "Triplete", "Melington 945", "Miami", "Andres Iniesta");
        Hotel5Estrellas h7 = new Hotel5Estrellas(5, 15, 60, 12, "Perla Negra", 55, "A", 5, 50, 120, 4, 0, "Trifulca", "Orlando 990", "Miami", "Joffrey Baratheon");
        Hotel4Estrellas h8 = new Hotel4Estrellas("Metrocidad", 20, "B", 4, 20, 40, 3, 0, "Trikitraka", "Mlington 1120", "Miami", "Xavi Alonso");
        Hotel5Estrellas h9 = new Hotel5Estrellas(3, 8, 50, 8, "Holandes Herrante", 60, "A", 5, 40, 96, 3, 0, "Tiburon", "Orlando 770", "Miami", "Daenerys Targaryen");
        Hotel4Estrellas h10 = new Hotel4Estrellas("Monarca", 30, "A", 4, 20, 30, 4, 0, "Tranteo", "Melington 2200", "Miami", "Iker Casillas");
        hoteles5.add(h1);
        hoteles4.add(h2);
        hoteles5.add(h3);
        hoteles4.add(h4);
        hoteles5.add(h5);
        hoteles4.add(h6);
        hoteles5.add(h7);
        hoteles4.add(h8);
        hoteles5.add(h9);
        hoteles4.add(h10);
        Camping c1 = new Camping(30, 10, "Si", "No", 600, "Turista", "Hawai 330", "Miami", "Harry Potter");
        Residencia r1 = new Residencia(25, "Si", "Si", "No", 550, "Trapecista", "Oregon 229", "Miami", "Frodo Bolson");
        Camping c2 = new Camping(25, 8, "No", "No", 400, "Tipman", "Hawai 780", "Miami", "Hermione Granger");
        Residencia r2 = new Residencia(20, "No", "Si", "Si", 400, "Turco", "Oregon 350", "Miami", "Gandalf el Gris");
        Camping c3 = new Camping(50, 20, "Si", "Si", 800, "Tuberculo", "Hawai 990", "Miami", "Ginny Weasley");
        Residencia r3 = new Residencia(30, "Si", "No", "No", 700, "Timo", "Oregon 667", "Miami", "Aragorn");
        Camping c4 = new Camping(20, 5, "No", "No", 400, "Tetrico", "Hawai 2290", "Miami", "Tom Riddle");
        Residencia r4 = new Residencia(22, "Si", "No", "Si", 450, "Tactica", "Oregon 882", "Miami", "Legolas");
        Camping c5 = new Camping(35, 12, "Si", "Si", 600, "Terrorista", "Hawai 115", "Miami", "Draco Malfoy");
        Residencia r5 = new Residencia(35, "No", "No", "Si", 650, "Tulipan", "Oregon 1349", "Miami", "Sauron");
        campings.add(c1);
        campings.add(c2);
        campings.add(c3);
        campings.add(c4);
        campings.add(c5);
        residencias.add(r1);
        residencias.add(r2);
        residencias.add(r3);
        residencias.add(r4);
        residencias.add(r5);
        do {
            System.out.println("Menu \n"
                    + "1-Mostrar Listado de Alojamientos \n"
                    + "2-Hoteles de mayor costo \n"
                    + "3-Campings con restaurant \n"
                    + "4-Residencias con descuentos a socios \n"
                    + "5-Salir");
            switch (des = read.nextInt()) {
                case 1:
                    s5.mostrarListado(hoteles5,hoteles4);
                    sc.mostrarLista(campings);
                    sr.mostrarLista(residencias);
                    break;
                case 2:
                    sh.compararPrecios(hoteles5, hoteles4);
                    s5.mostrarListado(hoteles5, hoteles4);
                    break;
                case 3:
                    sc.mostrarListaResto(campings);
                    break;
                case 4:
                    sr.mostrarListaDescuento(residencias);
                    break;
                case 5:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida del menu");
                    break;
            }
        } while (des != 5);
    }

}
