/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Kevin Gerardo Hinojosa Castellanos   A01411383   IMT
package spp.khinojosac.t01.p1.pkg1;
import java.util.Scanner;

/**
 *
 * @author Kevin Hinojosa
 */
public class SPPKHinojosaCT01P11 {

    /**
     * @param args the command line arguments
     */

            public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de promedio");
        
        //Variables.
        int mat;
        double cal1, cal2, cal3 , cal4, cal5, pro, suma;
        String res;
        
        System.out.println("Introduce tu matricula ");
        mat=teclado.nextInt();
        System.out.println("Introduce calificiación No. 1 ");
        cal1=teclado.nextDouble();
        System.out.println("Introduce calificación No. 2");
        cal2=teclado.nextDouble();
        System.out.println("Introduce calificación No. 3");
        cal3=teclado.nextDouble();
        System.out.println("Introduce calificación No. 4");
        cal4=teclado.nextDouble();
        System.out.println("Introduce calificación No. 5");
        cal5=teclado.nextDouble();
        
        //Operación Lógica.
        suma = (cal1 + cal2 +cal3 +cal4 + cal5);
        pro= suma/5;
        System.out.println("Promedio: " + pro);
        
        if(pro>7){
            res=("APROVADO");
            System.out.println("Estas " + res);
            }
            
           else{
            res=("REPROBADO");
            System.out.println("Estas " + res);
            
            
        }
        }
       
        
         
        // TODO code application logic here
    }
    

    
    

