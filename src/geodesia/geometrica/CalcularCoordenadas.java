/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geodesia.geometrica;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

/**
 *
 * @author LENOVO
 */
public class CalcularCoordenadas {
    
    double grados=0;
    double minutos=0;
    double segundos=0;
    double latitud;
    double a=6378388; //semieje a
    double e=0.00672267;//Exceso esferico al cuadrado
    double coseno;
    double seno;
    
    void ConvertirGrados (double unaLatitud){
        latitud= (grados)+(minutos/60)+(segundos/3600); 
        
    }
    
    void ConvertirAngulo(double unangulo){
        latitud=Math.toRadians(unangulo);
    }
    double seno(){
        return sin(latitud);
    }
    
    double coseno(){
        return cos(latitud);
    }
    void CalcularY(){
    double y;
    y=((a*coseno)/(Math.pow(1-e*Math.pow(seno,2),1/2)));
    }
    void CalcularZ(){
    double z;
    z=(((a*1-e)*seno)/(Math.pow(1-e*Math.pow(seno,2),1/2)));
    }

    Object ConvertirAngulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
