/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author maria
 */
public class clsBabyDogs extends clsDog {
    private String algo;

    public clsBabyDogs(String algo, String breed, boolean pedigree, String code, String name, int born_year, String color, String health_Status) {
        super(breed, pedigree, code, name, born_year, color, health_Status);
        this.algo = algo;
    }

    
    
    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }
    
    
    
}
