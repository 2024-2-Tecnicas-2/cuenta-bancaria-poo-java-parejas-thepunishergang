package com.mycompany.cuenta.bancaria.poo;

public class CuentaBancaria {
    // TODO: Aquí va el código de la clase CuentaBancaria
    
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = 0.015;
        
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setTipoInteres(double tipoInteres) {
        if(tipoInteres <= 10 && tipoInteres >= 0){
            this.tipoInteres = tipoInteres/100;
        }else{
            System.out.println("Lo sentimos, el interes no cumple las condiciones requeridas...");
        }
    }
  
    
    public double ingresar(double cantidad){
        if(cantidad > 0){
            this.saldo += cantidad;
        }else{
            System.out.println("Cantidad no valida...");
        }
        
        return saldo;
    }
    
    public double retirar(double cantidad){
        if(cantidad>0){
            this.saldo -= cantidad;
        }else{
            System.out.println("Cantidad no valida...");
        }
        
        return saldo;
    }
    
    
    public double calcularInteres() {
        return saldo + (tipoInteres*saldo);
        
    }
    
    
}
