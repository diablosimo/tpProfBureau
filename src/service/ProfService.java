/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Bureau;
import bean.Professeur;
import java.util.List;

/**
 *
 * @author simob
 */
public class ProfService extends AbstractFacade<Professeur> {

    Bureau bureau = new Bureau();
    BureauService bureauService = new BureauService();

    public ProfService() {
        super(Professeur.class);
    }

    public int affectProf(double salaire, String grade, double ancienté, int idBureau) {

        Professeur prof = new Professeur(salaire, grade, ancienté);

        prof.setBureau(bureauService.find(idBureau));
        
        create(prof);
        return 1;
    }

    public Professeur findAncienProf() {
        if (count() == 0) {
            return null;
        }
        Professeur ancienProf = find("P1");
        if (count() == 1) {
            return ancienProf;
        } else {
            for (int i = 1; i <= count(); i++) {
                Professeur prof = find("P" + i);
                if (prof.getAnciente() > ancienProf.getAnciente()) {
                    ancienProf = prof;
                }
            }
            return ancienProf;
        }
    }

    public List<Professeur> findProfByGrade(String grade) {
        return getEntityManager().createQuery("SELECT p FROM Professeur p WHERE p.grade='"+grade+"'").getResultList();
    }

    public List<Professeur> findProfByDepartement(String departement) {
        return getEntityManager().createQuery("SELECT p FROM Professeur p WHERE p.bureau.departement='"+departement+"'").getResultList();
    }

    public int isCollocataire(String idProf1, String idProf2) {
        if (count() == 0 || count() == 1) {
            return -1;
        }
        Professeur prof1 = find(idProf1);
        Professeur prof2 = find(idProf2);
        if (prof1.getBureau() == null || prof2.getBureau() == null) {
            return -2;
        } else {
            if (prof1.getBureau().getId()==prof2.getBureau().getId()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int swich(String idProf1, String idProf2) {
        if (isCollocataire(idProf1, idProf2) == 1) {
            return -1;
        }
        Bureau auxBureau = new Bureau();
        Professeur prof1 = find(idProf1);
        Professeur prof2 = find(idProf2);
        auxBureau = prof1.getBureau();
        prof1.setBureau(prof2.getBureau());
        edit(prof1);
        prof2.setBureau(auxBureau);
        edit(prof2);
        
        return 1;
    }

}
