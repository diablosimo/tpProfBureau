/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Bureau;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simob
 */
public class BureauService extends AbstractFacade<Bureau>{
    
    public BureauService() {
        super(Bureau.class);
    }
    
    public int createBureau(int etage, String departement){
        Bureau bureau=new Bureau( etage, departement);
        create(bureau);
        return 1;
    }
    
    public int countDesk(int etage) {
        int res=0;
        for (int i = 2; i < count(); i=i+2) {//
            Bureau bureau=find(i);
            if(bureau. getEtage()==etage){
                res++;
            }
        }
          return res;
    }
    
}
