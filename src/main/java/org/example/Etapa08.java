package org.example;

import org.example.repository.AutorizadorReembolso;

public class Etapa08 {
    public static class SistemaReembolso {
        private final AutorizadorReembolso autorizador;

        public SistemaReembolso(AutorizadorReembolso autorizador) {
            this.autorizador = autorizador;
        }

        public double calcularReembolso(String paciente, double valorConsulta, double percentualCobertura) {
            if (!autorizador.isAutorizado(paciente, valorConsulta)) {
                throw new IllegalArgumentException("Reembolso não autorizado para " + paciente);
            }
            return valorConsulta * percentualCobertura;
        }
    }
}