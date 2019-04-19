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
    double latitud ;
   
        double ConvertirGrados (){ 
        latitud= (grados)+(minutos/60)+(segundos/3600); 
        return latitud; 
    }
        
       void ConvertirAngulo(double unangulo){
         latitud =Math.toRadians(unangulo);
           
       }
//      double seno(){
//           return sin(latitud);
//       }
//      double coseno(){
//           return cos(latitud);
//       }
       
    double a=6378388; //semieje a
    double e=0.00672267;//primera excentricidad al cuadrado

    
    double CalcularY(){
    double y;
    y=a*(1-e)*cos(latitud)/(Math.pow(1-e*Math.pow(sin(latitud),2),1/2));
    return y;
    }
    double CalcularZ(){
    double z;
    z=a*(1-e)*sin(latitud)/(Math.pow(1-e*Math.pow(sin(latitud),2),1/2));
    return z;
    }
}