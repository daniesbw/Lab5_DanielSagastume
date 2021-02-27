package lab5_danielsagastume;
public class Docente extends Persona{
    private String cargo;
    private String facultad;
    private String dist_facultad;
    private String area;
    private String laboratorio;

    public Docente() {
    super();
    }

    public Docente(String cargo, String facultad, String dist_facultad, String area, String laboratorio, String nom, int num_registro, String apellido, String username, String contraseña) {
        super(nom, num_registro, apellido, username, contraseña);
        this.cargo = cargo;
        this.facultad = facultad;
        this.dist_facultad = dist_facultad;
        this.area = area;
        this.laboratorio = laboratorio;
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

    public String getDist_facultad() {
        return dist_facultad;
    }

    public void setDist_facultad(String dist_facultad) {
        this.dist_facultad = dist_facultad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    
}
