package org.example;

public class Etapa10 {
    /**
     * Calcula o valor do reembolso
     * @param valorConsulta Valor total da consulta médica.
     * @param percentualCobertura Percentual de cobertura do plano.
     * @return Valor do reembolso calculado.
     */
    public double calcularReembolso(double valorConsulta, double percentualCobertura) {
        return valorConsulta * percentualCobertura;
    }

    /**
     * Compara dois valores com margem de erro de 0.01.
     * @param esperado Valor esperado.
     * @param atual Valor calculado.
     * @return Verdadeiro se a diferença for menor ou igual à margem de erro.
     */
    public static boolean compararComMargem(double esperado, double atual) {
        return Math.abs(esperado - atual) <= 0.01;
    }
}