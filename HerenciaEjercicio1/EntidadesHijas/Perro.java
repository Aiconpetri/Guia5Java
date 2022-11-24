
package EntidadesHijas;

import EntidadPadre.Animal;

public final class Perro extends Animal {
    public Perro() {
    }
    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    @Override
    public void alimentarse() {
        System.out.println("El perro "+super.nombre+ " come sus "+super.alimento);
    }
    
}
