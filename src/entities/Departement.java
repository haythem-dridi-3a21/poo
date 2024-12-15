package entities;

import java.util.Objects;

public class Departement {
    private int id;
    private String nom;


    public Departement() {}
    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement departement = (Departement) obj;
        return id == departement.id && nom.equals(departement.nom);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
