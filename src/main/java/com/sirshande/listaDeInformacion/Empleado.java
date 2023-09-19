package com.sirshande.listaDeInformacion;

public class Empleado {
    /*
    Atributos
     */
    private int codigo;
    private String nombreCompleto;
    private double sueldoBase;
    private String estadoCivil;
    private int numHijos;
    private double sueldoNeto;
    private double comisionVenta;
    private double descuentoImpuesto;
    private double descuentoSeguro;

    /*
    Constructor
     */
    public Empleado(int codigo, String nombreCompleto, double sueldoBase, String estadoCivil, int numHijos, double sueldoNeto, double comisionVenta, double descuentoImpuesto, double descuentoSeguro) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.sueldoBase = sueldoBase;
        this.estadoCivil = estadoCivil;
        this.numHijos = numHijos;
        this.sueldoNeto = sueldoNeto;
        this.comisionVenta = comisionVenta;
        this.descuentoImpuesto = descuentoImpuesto;
        this.descuentoSeguro = descuentoSeguro;
    }

    /*
    Cadena de texto | Contiene la información de Empleado
     */
    public String getInfo() {
        return String.format("%c,%s, %.2f, %s, %d, %.2f, %.2f, %.2f, %.2f", codigo, nombreCompleto, sueldoBase, estadoCivil, numHijos, comisionVenta, descuentoImpuesto, descuentoSeguro, sueldoNeto);
    }
}

