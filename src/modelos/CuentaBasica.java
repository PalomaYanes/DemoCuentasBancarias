/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;



/**
 *
 * @author paloma
 */
public class CuentaBasica {
   
    
    int numeroDeCuenta; 
    private String cliente=null;
    public double saldo;
    public double cantidad;
    public double retiro;

    
    public void CuentaBasica (int numeroDeCuenta , String cliente, int saldo)
    {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.saldo =    saldo;
      
    }
    

    public double getSaldo()
    {
        return this.saldo;
    }
    
    public double depositar(double deposito)
    {
        this.cantidad=deposito;
        saldo= saldo + cantidad;
        return saldo;
    }
    
    public double retirar (double retirar)
    {
        
        this.retiro=retirar;
        saldo=saldo-retiro;
            
         return saldo;
    }
    
}

