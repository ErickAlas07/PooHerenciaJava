package escuela.prueba;


import escuela.materia.Materia;
import escuela.profesor.Contratado;
import escuela.profesor.Ordinario;
import escuela.profesor.Profesor;

public class Main {
    public static void main(String[] args) {

        Profesor profesor = new Profesor("Erick", "Alas", "0123456", "Media Jornada");
        System.out.println("Antes de método incluir:");
        System.out.println("Nombre: " + profesor.getNombre() + " " + profesor.getApellido() + "\n");

        Profesor.incluir(profesor);
        Profesor.modificar("0123456", "Alexander", "Galdámez");

        System.out.println("\nObtener el profesor mediante getters");
        System.out.println(profesor.getNombre() + " " + profesor.getApellido());

        //Uso de clases Contratado y Ordinario
        Contratado contratado = new Contratado("Marco","Serrano","9876543","Medio Tiempo", "24/01/2019", "24/06/2024");
        Profesor.incluir(contratado);

        Ordinario ordinario = new Ordinario("Wilfredo","Melgar","1234567","5 horas", 5);
        Profesor.incluir(ordinario);

        System.out.println("\nListado de profesores antes de eliminar.");
        profesor.reporte1();

        Profesor.eliminar("0123456");

        System.out.println("\nListado de profesores después de eliminar.");
        profesor.reporte1();

        //Uso de clase Materia
        Materia mat = new Materia("PGR", "Programación");
        Materia.incluir(mat);

        Materia.modificar("PGR", "Programación 2");
//        Materia.eliminar("PGR");
        mat.eliminar("PGR");
    }
}
