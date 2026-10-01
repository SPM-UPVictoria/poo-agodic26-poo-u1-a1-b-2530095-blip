package edu.upv.evaluacion;

import java.util.ArrayList;
import java.util.List;

public class SistemaCasilleros {
    private String nombreSucursal;
    private List<Casillero> directorioCasilleros;

    public SistemaCasilleros(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
        this.directorioCasilleros = new ArrayList<>();
    }

    public void agregarCasillero(Casillero casillero) {
        directorioCasilleros.add(casillero);
    }

    public void imprimirReporteGeneral() {
        System.out.println("\n=== REPORTE GENERAL DEL SISTEMA: " + nombreSucursal + " ===");
        for (Casillero casillero : directorioCasilleros) {
            casillero.consultarEstado();
        }
    }
}