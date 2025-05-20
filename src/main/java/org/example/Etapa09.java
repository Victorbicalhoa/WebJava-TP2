package org.example;

public class Etapa09 {
    /**
     * Representação de uma consulta médica.
     */
    public static class Consulta {
        private String paciente;
        private double valor;
        private double cobertura;

        public Consulta(String paciente, double valor, double cobertura) {
            this.paciente = paciente;
            this.valor = valor;
            this.cobertura = cobertura;
        }

        public String getPaciente() {
            return paciente;
        }

        public double getValor() {
            return valor;
        }

        public double getCobertura() {
            return cobertura;
        }
    }

    /**
     * Helper para criação de consultas padrão.
     */
    public static Consulta criarConsultaPadrao() {
        return new Consulta("Paciente Teste", 200.0, 0.7);
    }

    /**
     * Calcula o valor do reembolso com base na consulta.
     *
     * @param consulta Consulta médica realizada.
     * @return Valor do reembolso calculado.
     */
    public double calcularReembolso(Consulta consulta) {
        return consulta.getValor() * consulta.getCobertura();
    }
}