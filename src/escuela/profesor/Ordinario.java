package escuela.profesor;

public class Ordinario extends Profesor{
    private int yearsServicio;

    public Ordinario(String nombre, String apellido, String cedula, String dedicacion, int yearsServicio) {
        super(nombre, apellido, cedula, dedicacion);
        this.yearsServicio = yearsServicio;
    }

    public int getYearsServicio() {
        return yearsServicio;
    }

    public void setYearsServicio(int yearsServicio) {
        this.yearsServicio = yearsServicio;
    }
}
