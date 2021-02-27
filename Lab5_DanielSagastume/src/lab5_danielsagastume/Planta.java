package lab5_danielsagastume;
public class Planta extends Persona{
    private String cargo;
    private String facultad;
    private String carrera;
    private String clase;

    public Planta() {
    super();
    }

    public Planta(String cargo, String facultad, String carrera, String clase, String nom, int num_registro, String apellido, String username, String contraseña) {
        super(nom, num_registro, apellido, username, contraseña);
        this.cargo = cargo;
        this.facultad = facultad;
        this.carrera = carrera;
        this.clase = clase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
}
