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
public class Arbre {

    private Movil origen;

    public Movil getOrigen() {
        return origen;
    }

    public void setOrigen(Movil origen) {
        this.origen = origen;
    }

   

    public void addMovil(Movil nouMovil, Movil arrel) {
        if (arrel == null) {
            arrel = new Movil(null, null);
            arrel.setPrior(nouMovil);
            nouMovil.setPrior(arrel);
            nouMovil.getEsquerre().setNext(null);
            nouMovil.getDret().setNext(null);
        } else {
            if (arrel.getEsquerre().getValor() == 0) {
                addMovil(nouMovil, arrel.getEsquerre().getNext());

            } else {
                if (arrel.getDret().getValor() == 0) {
                    addMovil(nouMovil, arrel.getDret().getNext());
                } else {
                    System.out.println("Algo va mal");
                }
            }

        }
    }

}
