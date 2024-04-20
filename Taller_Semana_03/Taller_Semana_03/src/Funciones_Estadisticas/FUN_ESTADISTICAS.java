
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class FUN_ESTADISTICAS {
    
    public float Media(int [] valores){
        float total=0;
        float media;
        
        for (int i = 0; i < valores.length; i++) {
            total+=valores[i];
        }
        
        media=total/valores.length;
        return media;
    }
    
    public int Moda(int[] valores) {
        // Crear un mapa para almacenar la frecuencia de cada valor y acceder a datos asociados con claves únicas.
        Map<Integer, Integer> frecuencia = new HashMap<>(); // se crea un mapeo 

        // Calcular la frecuencia de cada valor en el array y encontrar la moda
        int moda = valores[0];
        int maxFrecuencia = 1;

        for (int i = 0; i < valores.length; i++) {
            int clave = valores[i];
            // se usa una clave para verificar si existe en el mapa
            if (frecuencia.containsKey(clave)) {
                frecuencia.put(clave, frecuencia.get(clave) + 1); // si ya existe se le aumentara la frecuencia en 1
            } else {
                frecuencia.put(clave, 1); // y si no existe empezara con la frencuencia en 1
            }
            if (frecuencia.get(clave) > maxFrecuencia) { // se compara la clave osea el valor con la max Frecuencia
                moda = clave;
                maxFrecuencia = frecuencia.get(clave); // se actualiza la la frecuencia 
            }
        }
         
        if (maxFrecuencia == 1) {
            return 0; // Si no hay moda, se retorna 0
        } else {
            return  moda; // Si hay moda, se retorna la moda como float 
        }
    }
    
     public float Mediana(int[] valores) {
        Arrays.sort(valores); // Ordenar los valores en orden ascendente
        int n = valores.length;
        if (n % 2 == 0) {
            // Si la cantidad de datos es par, calcular el promedio de los dos valores centrales
            int mediana1 = valores[n / 2 - 1];
            int mediana2 = valores[n / 2];
            return (mediana1 + mediana2) / 2.0f;
        } else {
            // Si la cantidad de datos es impar, devolver el valor central
            return valores[n / 2];
        }
    }

     public float Varianza(int[] valores) {
        float media = Media(valores); // Calcula la media de los valores
        int n = valores.length; // Obtén la cantidad de valores
        float sumaCuadradosDiferencias = 0;
        
        // Calcula la suma de los cuadrados de las diferencias entre cada valor y la media
        for (int valor : valores) {
            sumaCuadradosDiferencias += Math.pow(valor - media, 2);
        }
        
        // Calcula la varianza dividiendo la suma anterior por la cantidad de valores
        return sumaCuadradosDiferencias / n;
    }

    public float desviacionEstandar(int[] valores) {
        // Calcula la varianza
        float varianza = Varianza(valores);

        // Calcula la desviación estándar como la raíz cuadrada de la varianza
        return (float) Math.sqrt(varianza);
    }
      
}
