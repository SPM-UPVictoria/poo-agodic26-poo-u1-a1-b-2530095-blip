package edu.upv.evaluacion;

public class Casillero {
    public class Casillero {
        private String id;
        private String tamano;
        private boolean estaDisponible;
        private int codigoSeguridad;
        private double tarifaPorHora;
        private Paquete paqueteAlmacenado;

        public Casillero(String id, String tamano, double tarifaPorHora) {
            this.id = id;
            this.tamano = tamano;
            this.tarifaPorHora = tarifaPorHora;
            this.estaDisponible = true;
            this.paqueteAlmacenado = null;
        }

        public void depositarPaquete(Paquete paquete, int codigo) {
            if (!estaDisponible) {
                System.out.println("Error: El casillero " + id + " ya está ocupado.");
                return;
            }
            this.paqueteAlmacenado = paquete;
            this.codigoSeguridad = codigo;
            this.estaDisponible = false;
            System.out.println("Paquete " + paquete.getNumeroSeguimiento() + " depositado en el casillero " + id + ". Código configurado.");
        }

        public void retirarPaquete(int codigoIngresado, int horasAlmacenado) {
            if (estaDisponible) {
                System.out.println("El casillero " + id + " está vacío.");
                return;
            }
            if (this.codigoSeguridad != codigoIngresado) {
                System.out.println("Operación rechazada en el casillero " + id + ": Código de seguridad incorrecto.");
                return;
            }

            double totalAPagar = horasAlmacenado * tarifaPorHora;
            System.out.println("\n--- Retiro Exitoso ---");
            System.out.println("Paquete retirado: " + paqueteAlmacenado.getNumeroSeguimiento());
            System.out.println("Horas almacenado: " + horasAlmacenado);
            System.out.println("Total a pagar: $" + totalAPagar);

            this.paqueteAlmacenado = null;
            this.codigoSeguridad = 0;
            this.estaDisponible = true;
        }

        public void consultarEstado() {
            System.out.println("\n--- Estado del Casillero " + id + " ---");
            System.out.println("Tamaño: " + tamano);
            System.out.println("Tarifa por hora: $" + tarifaPorHora);
            if (estaDisponible) {
                System.out.println("Estado: Disponible");
            } else {
                System.out.println("Estado: Ocupado");
                System.out.println("Paquete almacenado: " + paqueteAlmacenado.getNumeroSeguimiento() + " (Destinatario: " + paqueteAlmacenado.getDestinatario() + ")");
            }
            System.out.println("----------------------------\n");
        }
    }
}
