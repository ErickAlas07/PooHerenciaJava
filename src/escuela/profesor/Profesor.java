package escuela.profesor;

public class Profesor {
    private String nombre;
    private String apellido;
    private String cedula;
    private String dedicacion;

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
    public void agregar(){
        System.out.println("Agregar profesor");
    }

    public void eliminar(){
        System.out.println("Eliminar profesor");
    }

    public void modificar(){
        System.out.println("Modificar profesor");
    }

    public void crearReporte(){
        System.out.println("Crear reporte de profesor");
    }

    public void verProfesor(){
        System.out.println("Ver profesor");
    }
}