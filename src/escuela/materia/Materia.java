package escuela.materia;

public class Materia {
    private String codigo;
    private String nombre;

    public Materia() {
    }

    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos propios
    public void agregar(){
        System.out.println("Agregar materia");
    }

    public void eliminar(){
        System.out.println("Eliminar materia");
    }

    public void modificar(){
        System.out.println("Modificar materia");
    }

    public void verMaterias(){
        System.out.println("Ver materias");
    }

    public void verTotalMaterias(){
        System.out.println("Ver total materias");
    }
}
