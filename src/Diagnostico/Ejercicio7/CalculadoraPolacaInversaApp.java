package Diagnostico.Ejercicio7;
import javax.swing.JOptionPane;
/*
Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y
un signo aritmético (String),
según este último se realizara la operación correspondiente.
Al final mostrara el resultado en un cuadro de dialogo.
Los signos aritméticos disponibles son:

+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^: 1º operando como base y 2º como exponente.
%: módulo, resto de la división entre operando1 y operando2.
*/
public class CalculadoraPolacaInversaApp {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese los operandos y el operador
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer operando:"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo operando:"));
        String operador = JOptionPane.showInputDialog("Ingrese el operador (+, -, *, /, ^, %):");

        // Realizar la operación correspondiente
        double result = 0;

        switch (operador) {
            case "+":
                result = operando1 + operando2;
                break;
            case "-":
                result = operando1 - operando2;
                break;
            case "*":
                result = operando1 * operando2;
                break;
            case "/":
                result = (double) operando1 / operando2;
                break;
            case "^":
                result = Math.pow(operando1, operando2);
                break;
            case "%":
                result = operando1 % operando2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador no válido.");
                return; // Salir del programa si el operador no es válido
        }

        // Mostrar el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El resultado es: " + result);
    }
}
