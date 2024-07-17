/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa1_segundoparcial;

/**
 *
 * @author pined
 */
public class Empleado {
    private String n;
    private int e;
    private double s;

    public Empleado(String nombre, int edad, double salario) {
        this.n = nombre;
        this.e = edad;
        this.s = salario;
    }

    // Métodos para acceder y modificar atributos
    public String getNombre() {
        return n;
    }

    public void setNombre(String nombre) {
        this.n = nombre;
    }

    public int getEdad() {
        return e;
    }

    public void setEdad(int edad) {
        this.e = edad;
    }

    public double getSalario() {
        return s;
    }

    public void setSalario(double salario) {
        this.s = salario;
    }

    // Método para imprimir información del empleado
    public void imprimirInformacion() {
        System.out.println("Nombre: " + n + ", Edad: " + e + ", Salario: " + s);
    }
}

