package cuentas;

/**
 * Esta clase emula a un cuenta bancaria
 * 
 * @author Sara
 * @version 1.0
 * @since 20.01.2022
*/

public class CCuenta {

    /**
     * @return nombre 
     * 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre El parámetro nombre identifica al titular de la cuenta
     * 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta El parámetro cuenta identifica el número de cuenta
     * 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo El parámetro saldo identifica el saldo disponible en la cuenta
     * 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés El parámetro tipoInterés identifica el tipo de interés de la cuenta
     * 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Nombre del propietario
     */
    private String nombre;
     /**
     * Número de cuenta
     */
    private String cuenta;
     /**
     * Saldo actual
     */
    private double saldo;
     /**
     * Tipo de interés
     */
    private double tipoInterés;

    public CCuenta(){}

    /**
     * ConstructoR con 4 parámetros
     * @param nom Nombre del propietario
     * @param cue Número de cuenta
     * @param sal Saldo disponible
     * @param tipo Tipo de interés
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @return getSaldo
     */
    public double estado()
    {
        return getSaldo();
    }

/**
     * 
     * 
     * @param cantidad El parámetro cantidad Suma una cantidad a la cuenta si esta no es menor que 0
 *     @throws Exception si la cantidad es menor que 0
 * 
*/
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
/**
 * Retira una cantidad de la cuenta si esta no es menor que 0 o si el saldo de la cuenta es negativo
 * @param cantidad El parámetro cantidad identifica la cantidad que se desea ingresar en la cuenta
 * @throws Exception si la cantidad a retirar es menor que 0 o el saldo insuficiente
 * 
*/
    public void retirar(double cantidad) throws Exception{
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
