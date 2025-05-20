package org.example;

import java.util.ArrayList;
import java.util.List;

public class Etapa05 {
    private final List<String> consultas = new ArrayList<>();

    /**
     * Calcula o valor do reembolso.
     *
     * @param paciente Nome do paciente.
     * @param valorConsulta Valor total da consulta médica.
     * @param percentualCobertura Percentual de cobertura do plano.
     * @return Valor do reembolso calculado.
     */
    public double calcularReembolso(String paciente, double valorConsulta, double percentualCobertura) {
        double reembolso = valorConsulta * percentualCobertura;
        adicionarConsulta(paciente, valorConsulta, percentualCobertura);
        return reembolso;
    }

    /**
     * Adiciona uma consulta ao histórico (fake).
     *
     * @param paciente Nome do paciente.
     * @param valor Valor da consulta.
     * @param cobertura Percentual de cobertura.
     */
    private void adicionarConsulta(String paciente, double valor, double cobertura) {
        consultas.add("Paciente: " + paciente + " | Valor: " + valor + " | Cobertura: " + cobertura);
    }

    /**
     * Lista todas as consultas armazenadas.
     *
     * @return Lista de consultas registradas.
     */
    public List<String> listarConsultas() {
        return new ArrayList<>(consultas);
    }
}