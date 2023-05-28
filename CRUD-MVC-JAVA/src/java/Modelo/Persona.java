package Modelo;

/**
 *
 * @author Elpepe
 */
public class Persona {
    int id;
    String dni;
    String nom;

    public Persona(int id, String dni, String nom) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
    }

    public Persona() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
