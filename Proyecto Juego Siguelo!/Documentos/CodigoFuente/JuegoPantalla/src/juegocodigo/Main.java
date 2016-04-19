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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 Matriz wawa = new Matriz();

 int vector1 [] =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,
 23,24,25};

 int vector1D[] = {25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,
 3,2,1,};

 int vector2[] = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,
 46,48,50};

 int vector2D[] = {50,48,46,44,42,40,38,36,34,32,30,28,26,24,22,20,18,16,14,12,
                   10,8,6,4,2};

 int vector3 [] = {3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60,63,
                   66,69,72,75};

 int vector3D [] = {75,72,69,66,63,60,57,54,51,48,45,42,39,36,33,30,27,24,21,18,
                    15,12,9,6,3};
 
 char vectorABC[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                     'Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

 char vectorABCD [] = {'Z','Y','X','W','V','U','T','S','R','Q','P','O','Ñ','N',
                       'M','L','K','J','I','H','G','F','E','D','C','B','A'};


// wawa.obtenerTableroRandom5X5(vector3D);


// ya funciona!!

 wawa.obtenerTableroRandom5X5(wawa.obtenerVectorResultado(wawa.obtenerVectorRandom()));



//   Random   aleatorio = new Random();
//   int azar = aleatorio.nextInt(26); //
//   System.out.println(azar);


    }
}


