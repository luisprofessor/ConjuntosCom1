/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntoscom1;

/**
 *
 * @author Javier
 */
public class ConjuntosCom1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Auto ford=new Auto("Ford","AA678DX");
        
        Auto autito=new Auto("Ford","AA678DX");
        
        
        System.out.println(ford.equals(autito));
        
        
        
    }
    
}
