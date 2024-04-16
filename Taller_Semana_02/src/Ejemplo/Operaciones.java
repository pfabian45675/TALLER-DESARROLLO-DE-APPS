
package Ejemplo;

/**
 *
 * @author USER 17
 */
public class Operaciones {
    public float suma(float num1, float num2){
        float suma;
        suma=num1+num2;
        return suma;
    }
    
    public float resta(float num1, float num2){
        float res;
        res=num1-num2;
        return res;
    }
    public float multiplicacion(float num1, float num2){
        float multi;
        multi=num1*num2;
        return multi;
    }
     public float division(float num1, float num2){
        float div;
        div=num1/num2;
        return div;
    }
      public float RaizCuadrada(float num1){
        float Rcuadrada;
        Rcuadrada=(float) Math.sqrt(num1);
        return Rcuadrada;
    }
      public float Potencia(float num1, float num2){
        float pot;
        pot = (float) Math.pow(num1, num2);
        return pot;
    }
      public float Seno(float num1){
          float seno;
          seno= (float) Math.sin(num1);
          return seno;
      }
       public float Coseno(float num1){
          float Coseno;
          Coseno= (float) Math.cos(num1);
          return Coseno;
      }
      public float RaizCubica(float num1){
          float Rcubica;
          Rcubica= (float) Math.cbrt(num1);
          return Rcubica;
      }
      
      public float Mayor(float num1, float num2){
          float mayor;
          if (num1>num2) {
              mayor= num1;
          } else {
              mayor= num2;
          }
          return mayor;
      }
}
