package edu.upv.evaluacion;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Casillero casillero1 = new Casillero("L-101", "Mediano", 15.50);
        Casillero casillero2 = new Casillero("L-205", "Grande", 25.00);
        Paquete paquete1 = new Paquete("TRK98765", "Said Polanco", 2.5);
        Paquete paquete2 = new Paquete("TRK12345", "Zaid Valdez", 8.0);

        casillero1.consultarEstado();
        casillero1.depositarPaquete(paquete1, 1234);
        casillero1.consultarEstado();
        System.out.println("\nIntentando retirar con código 9999...");
        casillero1.retirarPaquete(9999, 5);
        System.out.println("\nIntentando retirar con código 1234...");
        casillero1.retirarPaquete(1234, 5);

        casillero1.consultarEstado();
    }
}