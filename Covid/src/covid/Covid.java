/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

import Models.Departamento;
import utils.db.DB;

/**
 *
 * @author maria
 */
public class Covid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Departamento dep = new Departamento().getDepartamentoById(1);
        System.out.println(dep.getNombre());
    }
    
}
