package org.example;

public class Etapa11 {
    private static final double TETO_REEMBOLSO = 150.0;

    /**
     * Calcula o valor do reembolso respeitando o teto de R$ 150 por consulta.
     *
     * @param valorConsulta Valor total da consulta médica.
     * @param percentualCobertura Percentual de cobertura do plano.
     * @return Valor do reembolso calculado, respeitando o teto.
     */
    public double calcularReembolso(double valorConsulta, double percentualCobertura) {
        double reembolso = valorConsulta * percentualCobertura;
        return Math.min(reembolso, TETO_REEMBOLSO); // Aplica o limite de R$ 150
    }
}