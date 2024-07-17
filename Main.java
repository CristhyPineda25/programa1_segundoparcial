/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa1_segundoparcial;

/**
 *
 * @author pined
 */
// Main.java

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de GestorEmpleados
        GestorEmpleados gestor = new GestorEmpleados();
        
        Empleado emp1 = new Empleado("Pedro Zuniga", 55 , 10000.00);
        Empleado emp2 = new Empleado("Maria Fernandez", 22, 20000.00);
        Empleado emp3 = new Empleado("Jose Hernandez", 35, 15000.00);
        Empleado emp4 = new Empleado("Ana Herrera", 45, 20000.00);
        Empleado emp5 = new Empleado("Marbella Martinez", 32, 9500.00);
        
        gestor.agregarEmpleado(emp1);
        gestor.agregarEmpleado(emp2);
        gestor.agregarEmpleado(emp3);
        gestor.agregarEmpleado(emp4);
        gestor.agregarEmpleado(emp5);
      
       
        gestor.mostrarEmpleados();
      
    }
}
