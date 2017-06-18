/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviles;

/**
 *
 * @author Lluis Maria
 */
public class Movil {
    
    private Movil prior;
    private Nodo esquerre;
    private Nodo dret;

    public Movil getPrior() {
        return prior;
    }

    public void setPrior(Movil arrel) {
        this.prior = arrel;
    }

    public Nodo getEsquerre() {
        return esquerre;
    }

    public void setEsquerre(Nodo esquerre) {
        this.esquerre = esquerre;
    }

    public Nodo getDret() {
        return dret;
    }

    public void setDret(Nodo dret) {
        this.dret = dret;
    }

    public Movil(Nodo esquerre, Nodo dret) {
        this.esquerre = esquerre;
        this.dret = dret;
    }
    

   
           
   
    
    
    
    
}