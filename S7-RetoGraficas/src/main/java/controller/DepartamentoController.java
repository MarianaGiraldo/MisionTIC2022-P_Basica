
package controller;

import Models.Departamento;
import Models.GeneralModel;
import java.util.List;


public class DepartamentoController {
    
    public static List<Departamento> getDepartamentoList(){
        List<Departamento> depList;
        
        depList = new GeneralModel().getDepartamentoList();
        
        return depList;
    }
    
    
    public static Integer deleteDepartamento(Integer id){
        Departamento dep = (Departamento) new Departamento().get(id);
        return dep.delete();
    }
    
    
    public static Integer saveDepartamento(Integer id, String name, String code) throws Exception{
        int codigo = 0;
        Departamento new_dep = null;
        try {
            if( name.equals("") ){
                throw new Exception("El campo nombre no puede estar vacio.");
            }
        
            if( name.length() > 100 ){
                throw new Exception("El campo nombre solo puede tener 100 caracteres.");
            }
        } catch (Exception e) {
            return null;
        }
        
        try{
            codigo = Integer.parseInt(code);
        } catch(NumberFormatException e){
            System.err.println("Rl campo codigo debe ser un numero");;
            return null;
        }
        try {
            if( id == null ){
                Departamento validar_dep = (Departamento) new Departamento().getByCode(codigo);
                if( validar_dep != null){
                    throw new Exception("El departamento con el codigo " + codigo + " ya existe.");
                }

                new_dep = new Departamento();
            } else {
                new_dep = (Departamento) new Departamento().get(id);
            }
        } catch (Exception e) {
            return null;
        }
        
        new_dep.setCodigo( codigo );
        new_dep.setNombre(name);
        new_dep.save();
        return new_dep.getId();
            
        
    }
    
    public static Integer getDepartamento(Integer id){
        Departamento dep = (Departamento) new Departamento().get(id);
        return dep.getId();
    }
    
}
