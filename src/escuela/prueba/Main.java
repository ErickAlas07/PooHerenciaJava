package escuela.prueba;

import escuela.profesor.Profesor;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Juan", "Perez", "123456", "Tiempo completo");

        System.out.println("Nombre: " + profesor.getNombre());
        profesor.agregar();
    }
}
