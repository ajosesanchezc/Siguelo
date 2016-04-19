/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package juegocodigo;
import java.util.Random;

/**
 *
 * @author tony
 */
public class Matriz
{
private int[][] matriz;
private char [][] matrizABC;

/**
 * METODO ENCARGADO DE INDICAR SI UN ELEMENTO PASADO POR PARAMETRO
 * SE ENCUENTRA EN EL VECTOR.
 * @param pos
 * @param num
 * @param vector
 * @return
 */
public boolean encontrado(int pos,int num, int []vector )
{
    for (int i = 0; i<pos ;i++ )
    {
     if( vector[i]== num)
         return true;
    }
    return false;
}

/**
 * 
 * @return
 */
public int[] obtenerVectorRandom()
{
  int acum=0;
  int num=0;
  int patron []  = new int[5];
  Random aleatorio = new Random();
  boolean encon;
  patron[0] = aleatorio.nextInt(5);
  for(int i = 1; i <5; i++)
  {
    encon = false;
    while (encon!=true)
    {
        acum++;
        num = aleatorio.nextInt(5);
            if(encontrado(i,num,patron)== false)
            {
                patron[i]=num;
                encon = true;
            }
    }
  }
   return patron;
}

public int[] obtenerVectorResultado(int[]vector)
{
   int [] respuesta =  new int[25];

   for(int i=0 ; i<25 ; i++)
    {
        for (int j=0 ; j<5 ; j++)
        {
            respuesta[i] = vector[j];
            i++;
        }
        i--;
    }
    return respuesta;
}

private int[][] inicializarMatriz(int [][]matriz)
{
    for (int i=0 ; i<5 ; i++)
    
        for (int j=0 ; j<5 ; j++)
        
            matriz[i][j]=100;
            
    return matriz;
}

public int[][] obtenerTableroRandom5X5(int[]vector)
{

  matriz =  new int[5][5];
  inicializarMatriz(matriz);
  Random aleatorio = new Random();
  boolean val;

  matriz[0][0] = vector[0];
  int cont = 0;
  int  tam = vector.length;

    for (int k = 1; k< tam; k++)
    {
     val = false;
      while (val!=true)
      {
        cont++;
        int i = aleatorio.nextInt(5);
        int j = aleatorio.nextInt(5);
         if (matriz[i][j] == 100)
         {
            val=true;
            matriz[i][j]=vector[k];
         }

     }
    }
   return matriz;
}

public char [][] obtenerTableroRandomABC6X5(char []vector)
{

    matrizABC =  new char[6][5];
    Random   aleatorio = new Random();
    boolean val;
    matrizABC[0][0] = vector[0];

    int cont = 0;
    int  tam = vector.length;
     for (int k = 1; k< tam; k++)
     {
        val = false;
        while (val!=true)
        {
        cont++;
        int i = aleatorio.nextInt(6);
        int j = aleatorio.nextInt(5);
            if (matrizABC[i][j] == 0)
            {
                val=true;
                matrizABC[i][j]=vector[k];
            }
         }
     }
      return matrizABC;
}
  
}
