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
      double n=0;
        double [] gastos= new double[22222];
         JOptionPane.showMessageDialog(null, "Introduzca los gastos. El programa se detendra hasta introducir un numero negativo");
        for(int x=0;x<1000;x++){
             n=pedirDato();
             if(n>0){
                 gastos[x]=n;
             }else{
                 sumatotal(gastos);
             }
        }
      
        
    }
public static double pedirDato(){
    double n =0;
    Scanner kb= new Scanner(System.in);
    boolean flag;
    do{
        try{
         String x= JOptionPane.showInputDialog(null,"Introdusca un gasto realizado");
         n=new Integer (x);
         flag=false;
        }catch (Exception er){
            JOptionPane.showMessageDialog(null,"Intentelo de nuevo");
            kb.nextLine();
            flag=true;
        }
    }while(flag);
    return n;
}  
public static void sumatotal(double[]gastos ){
    double suma=0;
    for(int x=0;x<2222;x++){
        suma=suma+gastos[x];
    }
    JOptionPane.showMessageDialog(null, "La suma total de los gastos el igual a $"+suma);
    System.exit(0);
}
}
