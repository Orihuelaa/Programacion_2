package EjercicioClase09_04.Agregacion;

/*
Se requiere desarrollar un sistema para gestionar los empleados de una empresa. Cada empleado tiene un nombre y
un cargo dentro de la empresa. La empresa está organizada en departamentos, y cada departamento puede tener
varios empleados. Implementa un programa en Java que modele esta relación utilizando clases. Cada departamento
tiene un nombre y una lista de empleados asociados. El programa debe permitir crear empleados y departamentos,
agregar empleados a un departamento específico y mostrar en pantalla la lista de empleados de cada departamento.
Utiliza la relación de agregación entre clases para modelar esta estructura.
*/

import EjercicioClase09_04.Agregacion.Clases.Departamento;
import EjercicioClase09_04.Agregacion.Clases.Empleado;
import EjercicioClase09_04.Agregacion.Clases.Empresa;

public class Main {
    public static void main(String[] args) {
        // Crear empresa
        Empresa miEmpresa = new Empresa();

        // Crear departamentos
        Departamento ventas = new Departamento("Ventas");
        Departamento contabilidad = new Departamento("Contabilidad");

        // Crear empleados
        Empleado empleado1 = new Empleado("Vendedor", "Juan");
        Empleado empleado2 = new Empleado("Contador", "María");

        // Agregar empleados a los departamentos
        ventas.agregarEmpleado(empleado1);
        contabilidad.agregarEmpleado(empleado2);

        // Agregar departamentos a la empresa
        miEmpresa.agregarDepartamento(contabilidad);
        miEmpresa.agregarDepartamento(ventas);

        // Mostrar departamentos de la empresa
        miEmpresa.mostrarDepartamentos();

        //Mostrar Empleados de cada departamento
        ventas.mostrarEmpleados();
        contabilidad.mostrarEmpleados();
    }
}
