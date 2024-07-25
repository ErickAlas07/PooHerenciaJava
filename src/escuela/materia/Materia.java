package escuela.materia;

public class Materia {
    private String codigo;
    private String nombre;

    //Atributos agregados
    private static Materia [] materias = new Materia[5];
    private static int contador = 0;

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
    public static void incluir(Materia materia){
        System.out.println("\nEntrando a método incluir.");
        if(contador < materias.length){
            materias[contador] = materia;
            contador++;

            System.out.println("Materia agregada " + materia.nombre);
        } else{
            System.out.println("No se pueden agregar más materias. Límite alcanzado");
        }
    }

    public void eliminar (String codigo){
        System.out.println("\nEntrando a método eliminar materia");
        for(int i = 0; i < contador; i++){
            if(materias[i].codigo.equals(codigo)){
                materias[i] = materias[contador - 1];
                materias[contador - 1] = null;
                contador--;
                System.out.println("Materia eliminada con código: " + codigo);
                return;
            } else{
                System.out.println("Materia con código: " + codigo + " no encontrada.");
            }
        }
    }

    public static void modificar(String codigo, String nombre){
        System.out.println("\nEntrando a método modificar materia");
        for (int i = 0; i < contador; i++) {
            if (materias[i].codigo.equals(codigo)) {
                materias[i].nombre = nombre;
                System.out.println("Materia modificada: " + materias[i].nombre);
                return;
            }
        }
        System.out.println("Materia no encontrada: " + codigo);
    }

    public void reporte1(){
        System.out.println("\nEntrar a método de reporte 1 en Materia");
    }

    public void reporte2(){
        System.out.println("\nEntrar a método de reporte 2 en Materia");
    }
}
