package EjerciciosClase19_03.Ejercicio2;
/*
Desarrollar un programa que modele una cuenta bancaria que tiene los siguientes atributos, que deben ser
de acceso protegido:
 Saldo, de tipo float.
 Número de consignaciones con valor inicial cero, de tipo int.
 Número de retiros con valor inicial cero, de tipo int.
 Tasa anual (porcentaje), de tipo float.
 Comisión mensual con valor inicial cero, de tipo float.
La clase Cuenta tiene un constructor que inicializa los atributos saldo y tasa anual con valores pasados
como parámetros. La clase Cuenta tiene los siguientes métodos:
 Consignar una cantidad de dinero en la cuenta actualizando su saldo.
 Retirar una cantidad de dinero en la cuenta actualizando su saldo. El valor a retirar no debe superar
el saldo.
 Calcular el interés mensual de la cuenta y actualiza el saldo correspondiente.
 Extracto mensual: actualiza el saldo restándole la comisión mensual y calculando el interés mensual
correspondiente (invoca el método anterior).
 Imprimir: muestra en pantalla los valores de los atributos.
*/
public class Main {
    public static void main(String[] args) {
        // Crear una cuenta de ahorros con saldo inicial de $15000 y tasa anual del 5%
        CuentaDeAhorros cuentaAhorros = new CuentaDeAhorros(15000, 5);

        // Consignar $2000 a la cuenta de ahorros
        cuentaAhorros.Consignar(2000);

        // Retirar $500 de la cuenta de ahorros
        cuentaAhorros.Retirar(500);

        // Generar el extracto mensual de la cuenta de ahorros
        cuentaAhorros.ExtractoMensual();

        // Imprimir los detalles de la cuenta de ahorros
        cuentaAhorros.Imprimir();
    }
}
