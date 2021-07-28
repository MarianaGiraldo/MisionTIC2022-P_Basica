/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

import Models.Departamento;
import Models.Municipio;
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
       
        
//        Departamento dep = new Departamento().getDepartamentoById(8);
//        System.out.println( dep.getNombre() );
//        
//        Departamento dep2 = new Departamento().getDepartamentoById(22);
//        System.out.println( dep2.getNombre() );
        
        Municipio mun1 = new Municipio().getMunicipioById( 5 );
        System.out.println( mun1.getNombre() );
        System.out.println( mun1.getDepartamento().getNombre() );
        
        Departamento dep = new Departamento().get(34);
        dep.setNombre("aaaaaa");
        dep.setCodigo(1);
        
        int idNewDep = dep.save();
        System.out.println( "Id nuevo departamento: " + idNewDep );
        System.out.println(dep.getNombre());
        
           
        
    }
    
}
