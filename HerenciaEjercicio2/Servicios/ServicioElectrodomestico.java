package Servicios;

import EntidadPadre.Electrodomestico;
import java.util.Scanner;

public class ServicioElectrodomestico {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crerElectrodomestico(Electrodomestico e) {
        e.setPrecio(1000.00);
        System.out.println("Ingrese el peso");
        e.setPeso(read.nextInt());
        System.out.println("Ingrese el color");
        e.setColor(comprobarColor(read.next()));
        System.out.println("Ingrese la calidad");
        e.setConsumo(read.next().charAt(0));
    }

    public char comprobarConsumo(char letra) {
        switch (letra) {
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            case 'E':
                break;
            case 'F':
                break;
            default:
                letra = 'F';
                break;
        }
        return letra;
    }

    public String comprobarColor(String color) {
        switch (color.toLowerCase()) {
            case "blanco":
                color="Blanco";
                break;
            case "negro":
                color="Negro";
                break;
            case "rojo":
                color="Rojo";
                break;
            case "azul":
                color="Azul";
                break;
            case "gris":
                color="Gris";
                break;
            default:
                color="Blanco";
                break;
                

        }
        return color;
    }

    public void precioFinal(Electrodomestico e) {
        switch (e.getConsumo()) {
            case 'A':
                e.setPrecio(e.getPrecio()+1000);
                break;
            case 'B':
                 e.setPrecio(e.getPrecio()+800);
                break;
            case 'C':
                 e.setPrecio(e.getPrecio()+600);
                break;
            case 'D':
                 e.setPrecio(e.getPrecio()+500);
                break;
            case 'E':
                 e.setPrecio(e.getPrecio()+300);
                break;
            case 'F':
                 e.setPrecio(e.getPrecio()+100);
                break;
        }
       if (e.getPeso()<20){
           e.setPrecio(e.getPrecio()+100);
       }else if(e.getPeso()<50){
           e.setPrecio(e.getPrecio()+500);
       }else if(e.getPeso()<80){
           e.setPrecio(e.getPrecio()+800);
       }else{
           e.setPrecio(e.getPrecio()+1000);
       }
    }
}
