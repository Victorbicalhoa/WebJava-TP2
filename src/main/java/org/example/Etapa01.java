package org.example;

public class Etapa01 {
    /**
     * Calcula o valor do reembolso com base no valor da consulta e no percentual de cobertura.
     *
     * @param valorConsulta Valor total da consulta médica.
     * @param percentualCobertura Percentual de cobertura do plano.
     * @return Valor do reembolso calculado.
     */
    public double calcularReembolso(double valorConsulta, double percentualCobertura) {
        return valorConsulta * percentualCobertura;
    }
}