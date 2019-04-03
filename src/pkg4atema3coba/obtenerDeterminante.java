/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4atema3coba;

import java.util.Scanner;

/**
 *
 * @author cobak
 */
public class obtenerDeterminante
{
    
public double [][]matrizEspiral(int n){
        Scanner sc = new Scanner(System.in);
        int i, j, mayor, menor;
        int filaMayor, filaMenor, colMayor, colMenor;
        double [][] A = new double[n][n];
        System.out.println("Lectura de elementos de la matriz: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }
        return A;
}

 


//metodo que calcule la determinante
    
  public double Determinante(int i, double [][]matriz)
  {
      if (matriz.length==2) 
      {
        double deter=matriz[0][0]*matriz[1][1]-matriz[0][1]*matriz[1][0];       
        
        return  deter;
      }
      
      else
      {
        double deter=0;
        
          for (int j = 0; j < matriz.length; j++) 
          {
              double[][]temp = this.SubMatriz(i,j,matriz);
              
              deter=deter+Math.pow(-1, i+j)*matriz[i][j]*this.Determinante(0, temp);   
          }        
          return deter;
      }
  }
    
    
  
 //claculo de submatriz eliminado i, j
  
  
 private double[][]SubMatriz(int i,int j,double [][]matriz)
 { 
     double[][]temp=new double[matriz.length-1][matriz.length-1];
     
     int count1=0;
     int count2=0;

     for (int k = 0; k < matriz.length; k++) 
     {
         if (k!=i) 
         {
             count2=0;
            for (int l = 0; l < matriz.length; l++) 
            {
                if (l!=j) 
                {
                    temp[count1][count2]=matriz[k][l];
                    count2++;
                }
            }
            count1++;
         }                 
     }       
     return temp;
 }
 
 
 
 //metodo para calcular la adjunta de una matrzi
 
public double [][]AdjuntaMatriz(double [][]matriz)

{

   double[][]tempAdjunta=new double[matriz.length][matriz.length];
   
    for (int i = 0; i < tempAdjunta.length; i++) 
    {
        for (int j = 0; j < tempAdjunta.length; j++) 
        {
            double[][]temp  = this.SubMatriz(i, j, matriz) ;
            
            double elementoAdjunto=Math.pow(-1, i+j)*this.Determinante(0, temp);
            
            tempAdjunta[i][j]=elementoAdjunto;   
        }   
    }
    return tempAdjunta;
}
 

//metodo para obtener la transpuesta de la matriz

public double [][]TransouestaMatriz(double [][]matriz)

{
   double[][]tempTranspuesta=new double[matriz.length][matriz.length];
    for (int i = 0; i < tempTranspuesta.length; i++) 
    {
        for (int j = 0; j < tempTranspuesta.length; j++) 
        {
            tempTranspuesta[i][j]=matriz[j][i];   
        }   
    }
    return tempTranspuesta;
}

public double [][]inversaMatriz(double [][]matriz,double x){
    
    double[][]inMatriz=new double[matriz.length][matriz.length];
    for (int i = 0; i <matriz.length; i++) 
            {
                for (int j = 0; j < matriz.length; j++) 
                {
                    inMatriz[i][j]=matriz[i][j]/x;               
                }
    }
    return inMatriz;   
}
}
