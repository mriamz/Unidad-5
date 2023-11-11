/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacali;

/**
 *
 * @author laraf
 */
public class Practicacali {
 public static double[] promPorEstudiante(double[][] calificaciones){
        
        double[] estudiante = new double[3];
        
         for (int i = 0; i < calificaciones.length ; i++) { //Control de filas ESTUDIANTES
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) { //Control de columnas MATERIAS
               suma += calificaciones[i][j]; 
            }
            //System.out.println(suma);
            estudiante[i] = suma / 4;
        }
         
         return estudiante;
       
    }
 public static double []promMateria(double[][] calificaciones){
     
 
 
 double [] materia = new double [calificaciones[0].length];
     for (int j = 0; j < calificaciones[0].length; j++) {
         double suma2 = 0;
         for (int i = 0; i < calificaciones.length; i++) {
             
             suma2 += calificaciones[i][j]; 
             
         }
         materia[j]=suma2/3;
     }
 
 return materia;
 }
 
 
 
    
    public static void main(String[] args) {
        double[][] calificaciones = {
            {90.5, 85.0,78.5,92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5,91.0,87.5},
            
        };
        
      
        
        double[] totalPromedios = Practicacali.promPorEstudiante(calificaciones);
        for (int i = 0; i < totalPromedios.length; i++) {
            System.out.println("promedio por alumno "+totalPromedios[i]);
        }
       double [] tP=Practicacali.promMateria(calificaciones);
        for (int j = 0; j < tP.length; j++) {
            
            System.out.println("promedio de la materia  "+ tP[j]);
        }
    }
    
    
}
