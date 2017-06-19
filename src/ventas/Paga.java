/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

/**
 *
 * @author Lluis Maria
 */
public class Paga {
    
 private   String dia;
 private   double valor;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Paga(String dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }
            
    
}
