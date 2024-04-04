package EjerciciosClase19_03.Ejercicio2;
/*
Cuenta corriente: posee un atributo de sobregiro, el cual se inicializa en cero.
Se redefinen los siguientes métodos:
Retirar: se retira dinero de la cuenta actualizando su saldo. Se puede retirar dinero superior al
saldo. El dinero que se debe queda como sobregiro.
Consignar: invoca al método heredado. Si hay sobregiro, la cantidad consignada reduce el
sobregiro.
Extracto mensual: invoca al método heredado.
Un nuevo método imprimir que muestra en pantalla el saldo de la cuenta, la comisión mensual,
el número de transacciones realizadas (suma de cantidad de consignaciones y retiros) y el valor
de sobregiro.
*/
public class CuentaCorriente extends Cuenta{
    private float sobregiro = 0;

    //Constructor
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    //Metodos
    @Override
    public void Consignar(float cantidad) {
        super.Consignar(cantidad);
        if (sobregiro > 0) {
            this.saldo += sobregiro; //Sobregiro posee valor Negativo
            sobregiro = 0;
        }
    }
    @Override
    public void Retirar(float cantidad) {
        this.saldo -= cantidad;
        if (saldo < 0){
            sobregiro += saldo;
            saldo = 0;
        }
    }
    @Override
    public void ExtractoMensual() {
        super.ExtractoMensual();
    }

    @Override
    public void Imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comision Mensual: " + comisionAnual/12);
        System.out.println("Transacciones Totales: " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Sobregiro: " + sobregiro);
    }
}

