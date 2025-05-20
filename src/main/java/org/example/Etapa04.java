package org.example;

public class Etapa04 {

     //Representação básica de um Paciente dentro da mesma classe.

    public static class Paciente {
        private String nome;

        public Paciente(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    /**
     * Calcula o valor do reembolso, agora recebendo um objeto Paciente.
     * @param paciente Paciente associado à consulta.
     * @param valorConsulta Valor total da consulta médica.
     * @param percentualCobertura Percentual de cobertura do plano.
     * @return Valor do reembolso calculado.
     */
    public double calcularReembolso(Paciente paciente, double valorConsulta, double percentualCobertura) {
        return valorConsulta * percentualCobertura;
    }
}