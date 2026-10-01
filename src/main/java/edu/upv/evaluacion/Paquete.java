package edu.upv.evaluacion;

public class Paquete {
    public class Paquete {
        private String numeroSeguimiento;
        private String destinatario;
        private double pesoKg;

        // Constructor: numeroSeguimiento es el número de rastreo, destinatario es quien recibe y pesoKg el peso
        public Paquete(String numeroSeguimiento, String destinatario, double pesoKg) {
            this.numeroSeguimiento = numeroSeguimiento;
            this.destinatario = destinatario;
            this.pesoKg = pesoKg;
        }
        // Métodos Getter
        public String getNumeroSeguimiento() {
            return numeroSeguimiento;
        }
        public String getDestinatario() {
            return destinatario;
        }
        public double getPesoKg() {
            return pesoKg;
        }
    }
}
