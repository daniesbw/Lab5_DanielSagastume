package lab5_danielsagastume;
public class Admins extends Persona{
    private String cargo;
    private String area;
    private int cant_sub;
    private String nom_as;
    private String jefe;

    public Admins() {
        super();
    }

    public Admins(String cargo, String area, int cant_sub, String nom_as, String jefe, String nom, int num_registro, String apellido, String username, String contraseña) {
        super(nom, num_registro, apellido, username, contraseña);
        this.cargo = cargo;
        this.area = area;
        this.cant_sub = cant_sub;
        this.nom_as = nom_as;
        this.jefe = jefe;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCant_sub() {
        return cant_sub;
    }

    public void setCant_sub(int cant_sub) {
        this.cant_sub = cant_sub;
    }

    public String getNom_as() {
        return nom_as;
    }

    public void setNom_as(String nom_as) {
        this.nom_as = nom_as;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }
    
}
