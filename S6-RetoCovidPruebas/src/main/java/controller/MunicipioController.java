package controller;

import Models.Departamento;
import Models.Municipio;
import Models.GeneralModel;
import java.util.List;


public class MunicipioController {
    public static List<Municipio> getMunicipioList(){
        List<Municipio> munList;
        
        munList = new GeneralModel().getMunicipioList();
        
        return munList;
    }
    
    
    public static Integer deleteMunicipio(Integer id) throws Exception{
        Municipio mun = (Municipio) new Municipio().get(id);
        return mun.delete();
    }
    
    
    public static Integer saveMunicipio(Integer id, Departamento departamento, String name, String code) throws Exception{
        int codigo = 0;
        Municipio new_mun = null;
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
            System.err.println("El campo codigo debe ser un numero");;
            return null;
        }
        try {
            if( id == null ){
                Municipio validar_mun = (Municipio) new Municipio().getMunicipioByCode(codigo);
                if( validar_mun != null){
                    throw new Exception("El municipio con el codigo " + codigo + " ya existe.");
                }

                new_mun = new Municipio();
            } else {
                new_mun = (Municipio) new Municipio().get(id);
            }
        } catch (Exception e) {
            return null;
        }
        
        new_mun.setCodigo( codigo );
        new_mun.setNombre(name);
        new_mun.setDepartamento(departamento);
        new_mun.save();
        return new_mun.getId();
            
        
    }
    
    public static Integer getMunicipio(Integer id) throws Exception{
        Municipio mun = (Municipio) new Municipio().get(id);
        return mun.getId();
    }
    
    
}
