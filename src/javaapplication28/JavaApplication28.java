
package javaapplication28;


import java.awt.BorderLayout;
import java.util.*;
public class JavaApplication28 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ArrayList <String> nombre =  new ArrayList ();
        ArrayList <Integer> dia =  new ArrayList ();
        ArrayList <Integer> salario =  new ArrayList ();
        ArrayList <Integer> total =  new ArrayList ();
        boolean decision=true;
        
        int resul=0, m;
        
        while(decision){
            System.out.println("Ingrese el nombre del trabajador: ");
            nombre.add(leer.next());
            System.out.println("");
            
            System.out.println("Ingrese el salario del trabajador: ");
            salario.add(leer.nextInt());
            System.out.println("");
            
            System.out.println("Ingrese los dias trabajados: ");
            dia.add(leer.nextInt()); 
            
            System.out.println("Quiere ingresar otro trabajdor? (0 para salir)");
            m=leer.nextInt();
            
            
            if(m==0){
                decision=false;
            }
                  
        }
        
        for(int x=0; x<nombre.size();x++){
            resul=dia.get(x)*salario.get(x);
            total.add(resul);
        }
        
        for(int x=0; x<nombre.size();x++){
            System.out.println("Nombre \t Salario \t Dia \t Total");
                
            System.out.println(nombre.get(x)+"\t"+ salario.get(x) + "\t" + dia.get(x)+ "\t" + total.get(x) );
        }
        
    }
    
}
