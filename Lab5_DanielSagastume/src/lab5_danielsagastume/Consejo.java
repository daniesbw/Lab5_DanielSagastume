package lab5_danielsagastume;
public class Consejo extends Persona{
    private String cargo;
    private String puesto;
    private int cant_becados;
    private int num_acargo;
    private String lugar;
    private String cargo2;
    private String nom_acuerdo;

    public Consejo() {
    super();
    }

    public Consejo(String cargo, String puesto, int cant_becados, int num_acargo, String lugar, String cargo2, String nom_acuerdo, String nom, int num_registro, String apellido, String username, String contraseña) {
        super(nom, num_registro, apellido, username, contraseña);
        this.cargo = cargo;
        this.puesto = puesto;
        this.cant_becados = cant_becados;
        this.num_acargo = num_acargo;
        this.lugar = lugar;
        this.cargo2 = cargo2;
        this.nom_acuerdo = nom_acuerdo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getCant_becados() {
        return cant_becados;
    }

    public void setCant_becados(int cant_becados) {
        this.cant_becados = cant_becados;
    }

    public int getNum_acargo() {
        return num_acargo;
    }

    public void setNum_acargo(int num_acargo) {
        this.num_acargo = num_acargo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCargo2() {
        return cargo2;
    }

    public void setCargo2(String cargo2) {
        this.cargo2 = cargo2;
    }

    public String getNom_acuerdo() {
        return nom_acuerdo;
    }

    public void setNom_acuerdo(String nom_acuerdo) {
        this.nom_acuerdo = nom_acuerdo;
    }
    
}
