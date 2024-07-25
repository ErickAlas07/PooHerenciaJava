package escuela.profesor;

public class Contratado extends Profesor{
    private String fechaInicio;
    private String fechaFin;

    public Contratado() {
    }

    public Contratado(String nombre, String apellido, String cedula, String dedicacion, String fechaInicio, String fechaFin) {
        super(nombre, apellido, cedula, dedicacion);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}