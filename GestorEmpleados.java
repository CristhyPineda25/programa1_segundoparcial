/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa1_segundoparcial;

import java.util.ArrayList;
import java.util.List;

// GestorEmpleados.java

public class GestorEmpleados {
    private final List<Empleado> listaEmpleados;

    
    public GestorEmpleados() {
        listaEmpleados = new ArrayList<>();
    }

   
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    
    public void mostrarEmpleados() {
        System.out.println("Lista de empleados:");
        for (Empleado emp : listaEmpleados) {
            emp.imprimirInformacion();
        }
    }

    void agregarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
