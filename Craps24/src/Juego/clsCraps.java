
package Juego;

//Si lanzo siete u once: Ganó en el primer tiro
//Si lanzo 2, 3, o 12: Pierdo al primer tiro
        
//Sino es ninguna, guardo el valor, y lanzo hasta
//que me salga el mismo valor que obtuve en el primer tiro
// Y si lanzo 7, pierdo

public class clsCraps {
    
    private enum ESTADO{CONTINUA, GANO, PERDIO};
    private final clsDado dado1 = new clsDado(6);
    private final clsDado dado2 = new clsDado(6);
    
    private static final int DOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;

    public clsCraps() {
    }
    
    
    public boolean jugar(){
        ESTADO estadoJuego;
        int miPunto= 0;
        int valor_dados = lanzarDados();
        estadoJuego = switch (valor_dados) {
            case SIETE -> ESTADO.GANO;
            case ONCE -> ESTADO.GANO;
            case DOS -> ESTADO.PERDIO;
            case TRES -> ESTADO.PERDIO;
            case DOCE -> ESTADO.PERDIO;
            default -> ESTADO.CONTINUA;
        };
        if(estadoJuego == ESTADO.CONTINUA)
            miPunto = valor_dados;
        
        while(estadoJuego == ESTADO.CONTINUA){
            valor_dados = lanzarDados();
            if(miPunto == valor_dados)
                estadoJuego = ESTADO.GANO;
            else
                if(valor_dados == SIETE)
                    estadoJuego = ESTADO.PERDIO;
        }
        
        return estadoJuego == ESTADO.GANO;
    }
    private int lanzarDados(){
        int suma;
        int valor1 = dado1.lanzar();
        int valor2 = dado2.lanzar();
        suma = valor1 + valor2;
        return suma;
    }
    
}
