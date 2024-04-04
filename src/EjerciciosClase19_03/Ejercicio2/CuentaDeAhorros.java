package EjerciciosClase19_03.Ejercicio2;
/*
Cuenta de ahorros: posee un atributo para determinar si la cuenta de ahorros está activa (tipo
boolean).Si el saldo es menor a $10 000, la cuenta está inactiva, en caso contrario se considera
activa.
Los siguientes métodos se redefinen:
Consignar: se puede consignar dinero si la cuenta está activa. Debe invocar al método
heredado.
Retirar: es posible retirar dinero si la cuenta está activa. Debe invocar al método heredado.
Extracto mensual: si el número de retiros es mayor que 4, por cada retiro adicional, se cobra
$1000 como comisión mensual. Al generar el extracto, se determina si la cuenta está activa o
no con el saldo.
Un nuevo método imprimir que muestra en pantalla el saldo de la cuenta, la comisión mensual
y el número de transacciones realizadas (suma de cantidad de consignaciones y retiros).
*/
public class CuentaDeAhorros extends Cuenta{
    private boolean cuentaAhorrosActiva;
    float comisionMensual = 0;

    //Constructor
    public CuentaDeAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        VerificarCuentaDeAhorros();
    }

    //Metodos
    private void VerificarCuentaDeAhorros(){
        if (super.saldo >= 10000){
            this.cuentaAhorrosActiva = true;
        }else {
            this.cuentaAhorrosActiva = false;
        }
    }

    @Override
    public void Consignar(float cantidad) {
        super.Consignar(cantidad);
        VerificarCuentaDeAhorros();
    }

    @Override
    public void Retirar(float cantidad) {
        if (cuentaAhorrosActiva){
            super.Retirar(cantidad);
        }
        else {
            System.out.println("Bloqueada: Cuenta inactiva.");
        }
        VerificarCuentaDeAhorros();
    }

    @Override
    public void ExtractoMensual() {
        if (super.numeroRetiros > 4) {
            System.out.println("Ha superado la cantidad limite de extracciones mensuales.\n " +
                    "Se le cobraran $1000 a partir de ahora por cada extraccion.");
            super.ExtractoMensual();
            this.saldo -= 1000;
            comisionMensual += 1000;
            VerificarCuentaDeAhorros();
        }
    }

    @Override
    public void Imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comision Mensual: " + comisionMensual);
        System.out.println("Transacciones Totales: " + (numeroConsignaciones + numeroRetiros));
    }
}
