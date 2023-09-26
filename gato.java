/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author teenc
 */
public class gato extends animal{
    protected String dieta;

    public gato( String nombre, int edad, String raza) {
        super(nombre, edad, raza);
        this.dieta = "Carnivoro";
    }
    @Override public void mostrare(){
    System.out.println("Nombre "+nombre+" edad "+edad+" raza "+raza+"dieta"+dieta);
    
    }
       public void mostrarse(){
    mostrare();
        System.out.println("dieta "+dieta);
    }
}
