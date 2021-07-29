
package Controllers;

import Models.Departamento;

/**
 *
 * @author maria
 */
public class ParametrizationController {
    
    public void createDept(String name, Integer code) throws Exception{
        Departamento dep = new Departamento();
        dep.setCodigo(code);
        dep.setNombre(name);
        
        try {
            dep.save();
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
            throw new Exception("No se pudo crear el departamento. ");
        }
        
        
    }
    
}
