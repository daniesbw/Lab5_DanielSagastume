package lab5_danielsagastume;
public class Tutores extends Estudiante{
    private String clase;
    private boolean laboratorio;

    public Tutores() {
        super();
    }

    public Tutores(String clase, boolean laboratorio, String carrera, String Equipo, String facultad, int cant_clases, String beca, String carro, String nom, int num_registro, String apellido, String username, String contraseña) {
        super(carrera, Equipo, facultad, cant_clases, beca, carro, nom, num_registro, apellido, username, contraseña);
        this.clase = clase;
        this.laboratorio = laboratorio;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(boolean laboratorio) {
        this.laboratorio = laboratorio;
    } 
}
