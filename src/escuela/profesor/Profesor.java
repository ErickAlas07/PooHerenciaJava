package escuela.profesor;

public class Profesor {
    private String nombre;
    private String apellido;
    private String cedula;
    private String dedicacion;

    private static Profesor[] profesores = new Profesor[3];
    private static int contador = 0;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String cedula, String dedicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.dedicacion = dedicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    //Métodos propios
    public static void incluir(Profesor profesor){
        System.out.println("\nEntrando al método incluir.");
        if(contador < profesores.length){
            profesores[contador] = profesor;
            contador++;
            System.out.println("Profesor agregado: " + profesor.nombre + " " + profesor.apellido);
        } else{
            System.out.println("No se pueden agregar más profesores. Límite alcanzado.");
        }
    }

    public static void eliminar(String cedula){
        System.out.println("\nEntrando al método de eliminar profesor");
        for (int i=0; i<contador; i++){
            if(profesores[i].cedula.equals(cedula)){
                profesores[i] = profesores[contador - 1];
                profesores[contador - 1] = null;
                contador--;
                System.out.println("Profesor eliminado con cédula: " + cedula);
                return;
            } else{
                System.out.println("Profesor con cédula: " + cedula + " no encontrado.");
            }
        }
    }

    public static void modificar(String cedula, String nombre, String apellido){
        System.out.println("\nEntrando al método de modificar profesor");
        for(int i=0; i < contador; i++){
            if(profesores[i].cedula.equals(cedula)){
                profesores[i].nombre = nombre;
                profesores[i].apellido = apellido;
                System.out.println("Profesor modificado: " + profesores[i].nombre + " " + profesores[i].apellido);
                return;
            } else{
                System.out.println("Profesor con cédula: " + cedula + " no encontrado.");
            }
        }
    }

    public void reporte1(){
        System.out.println("\nEntrando a método de reporte 1");
        for(Profesor profesor : profesores){
            if(profesor != null){
                System.out.println(profesor.nombre + " " + profesor.apellido);
            }
        }
    }

    public void reporte2(){
        System.out.println("\nEntrando a método de reporte 2");
    }
}