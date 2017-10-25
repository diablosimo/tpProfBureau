/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author simob
 */
@Entity
public class Bureau implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private int etage;
    private String departement;
    @OneToMany(mappedBy = "bureau")
    private List<Professeur> professeurs;
   
    
  
    
    public Bureau() {
        
    }

    public Bureau(int id) {
        this.id = id;
    }

    public Bureau(int id, int etage, String departement) {
        this.id = id;
        this.etage = etage;
        this.departement = departement;
    }

    public Bureau(int etage, String departement) {
       
       this.etage = etage;
        this.departement = departement;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public List<Professeur> getProfesseurs() {
       if (professeurs==null){
           List<Professeur> professeurs=new ArrayList<>();
       }
        return professeurs;
    }

    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bureau)) {
            return false;
        }
        Bureau other = (Bureau) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bureau{" + "id=" + id + ", etage=" + etage + ", departement=" + departement + '}';
    }

 
}
