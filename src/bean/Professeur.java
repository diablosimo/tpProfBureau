/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author simob
 */
@Entity
public class Professeur implements Serializable {

    @Id
    private String id;
    private double salaire;
    private String grade;
    private double anciente;
    @ManyToOne
    private Bureau bureau;
    private static int cmp;
    

   

    public Professeur() {
  
    }

    public Professeur(String id) {
        this.id = id;
    }

    public Professeur(String id, double salaire, String grade, double anciente) {
        this.id = id;
        this.salaire = salaire;
        this.grade = grade;
        this.anciente = anciente;
    }

    public Professeur(double salaire, String grade, double anciente) {
     
        this.salaire = salaire;
        this.grade = grade;
        this.anciente = anciente;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getAnciente() {
        return anciente;
    }

    public void setAnciente(double anciente) {
        this.anciente = anciente;
    }

    public Bureau getBureau() {
        if(bureau==null){
            Bureau bureau=new Bureau();
        }
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professeur)) {
            return false;
        }
        Professeur other = (Professeur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Professeur{" + "id=" + id + ", salaire=" + salaire + ", grade=" + grade + ", anciente=" + anciente + '}';
    }

  
}
