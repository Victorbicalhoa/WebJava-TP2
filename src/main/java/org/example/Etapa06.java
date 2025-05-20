package org.example;

public class Etapa06 {
    /**
     * Interface representando um plano de saúde com cobertura variável.
     */
    public interface PlanoSaude {
        double getPercentualCobertura();
    }

    /**
     * Implementação concreta para um plano de 50% de cobertura.
     */
    public static class PlanoSaude50 implements PlanoSaude {
        @Override
        public double getPercentualCobertura() {
            return 0.5;
        }
    }

    /**
     * Implementação concreta para um plano de 80% de cobertura.
     */
    public static class PlanoSaude80 implements PlanoSaude {
        @Override
        public double getPercentualCobertura() {
            return 0.8;
        }
    }

    /**
     * Calcula o valor do reembolso com base no plano de saúde.
     *
     * @param planoSaude Plano de saúde utilizado.
     * @param valorConsulta Valor total da consulta médica.
     * @return Valor do reembolso calculado.
     */
    public double calcularReembolso(PlanoSaude planoSaude, double valorConsulta) {
        return valorConsulta * planoSaude.getPercentualCobertura();
    }
}