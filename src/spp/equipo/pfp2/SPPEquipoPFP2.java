/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.equipo.pfp2;

import javax.swing.JOptionPane;

/**
 *
 * @author Nohely C
 */
public class SPPEquipoPFP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vector();
    }
    public static int solicitaEntero(String mensaje){
     
        int n = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            n = Integer.parseInt(dato);
            flag=false;
            }catch (Exception er) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return n;
    }
    public static double solicitaGasto(String mensaje){
     
        double n = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            n= Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return n;
    }
    public static double solicitaGasto(){
        //boolean flag;
        double n=0;
        //do{
            String dato=JOptionPane.showInputDialog (null, "Introduzca el gasto:");
            n= Double.parseDouble(dato);
            
            //flag=true;
                if(0>n){
                    JOptionPane.showMessageDialog (null,"Ha introducido un valor negativo");
                    
                    //flag=false;
                }
             //}while(flag==false);
        
        return n;
        }
    public static void Vector(){
        double suma=0;
        boolean flag;
        do{
        int tamaño=solicitaEntero ("Introduzca el número de gastos deseados"); 
        double [] arreglo = new double [tamaño];
        flag=true;
        for (int i=0; i<arreglo.length; i++){
                arreglo[i]= solicitaGasto();
                if (arreglo[i]>0){
                    suma = (suma + arreglo[i]);
                    flag=false;
                }
                else{
                    
                }
            }while(flag==false);
        
        }
        JOptionPane.showMessageDialog (null, "La suma de sus gastos es: " + suma);
        

        
        }
}