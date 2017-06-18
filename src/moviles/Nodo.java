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
public class Nodo {
    
    private int valor;
    private int distancia;
    private Movil next;

    public Movil getNext() {
        return next;
    }

    public Nodo(int valor, int distancia, Movil next) {
        this.valor = valor;
        this.distancia = distancia;
        this.next = next;
    }

    public void setNext(Movil next) {
        this.next = next;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    
    }

    
    
    
    

