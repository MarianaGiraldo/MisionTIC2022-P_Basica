package petmanager;

import Classes.*;
import java.util.Calendar;

public class PetManager {

  public static void main(String[] args) {
    
    clsDog dog1 = new clsDog("Criollo", false ,"001", "Firulais", 2013, "Negro", "Sano" );
    clsCat cat1 = new clsCat("Angora" ,"002", "Menino", 2018, "Blanco", "Enfermo" );

    int current_year = Calendar.getInstance().get(Calendar.YEAR);

    int agePet1 = current_year - dog1.getBorn_year();
    int agePet2 = current_year - cat1.getBorn_year();

    if(agePet1 > agePet2){
      System.out.println("La mascota " + dog1.getName() + " es mayor que la mascota " + cat1.getName());
    }else{
      if (agePet1 < agePet2){
        System.out.println("La mascota " + cat1.getName() + " es mayor que la mascota " + dog1.getName());
      } else{
        System.out.println("La mascota " + dog1.getName() + " tiene la misma edad que la mascota " + cat1.getName());
      }
    }
    dog1.Eat();
    cat1.Eat();
    dog1.Sound();
    
    dog1.WalkAround();
      System.out.println("FINAL");
  }
}
    

