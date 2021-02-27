package lab5_danielsagastume;
public class Estudiante extends Persona{
    private String carrera;
    private String Equipo;
    private String facultad;
    private int cant_clases;
    private String beca;
    private String carro;

    public Estudiante() {
    super();
    }

    public Estudiante(String carrera, String Equipo, String facultad, int cant_clases, String beca, String carro, String nom, int num_registro, String apellido, String username, String contraseña) {
        super(nom, num_registro, apellido, username, contraseña);
        this.carrera = carrera;
        this.Equipo = Equipo;
        this.facultad = facultad;
        this.cant_clases = cant_clases;
        this.beca = beca;
        this.carro = carro;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getCant_clases() {
        return cant_clases;
    }

    public void setCant_clases(int cant_clases) {
        this.cant_clases = cant_clases;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
    
}
