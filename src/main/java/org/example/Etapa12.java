package org.example;

import org.example.repository.AutorizadorReembolso;

public class Etapa12 {
    /**
     * Interface para planos de saúde.
     */
    public interface PlanoSaude {
        double getPercentualCobertura();
    }

    /**
     * Representação de uma consulta médica.
     */
    public static class Consulta {
        private String paciente;
        private double valor;

        public Consulta(String paciente, double valor) {
            this.paciente = paciente;
            this.valor = valor;
        }

        public String getPaciente() {
            return paciente;
        }

        public double getValor() {
            return valor;
        }
    }

    /**
     * Sistema que calcula reembolso considerando plano de saúde e autorização.
     */
    public static class SistemaReembolso {
        private final AutorizadorReembolso autorizador;

        public SistemaReembolso(AutorizadorReembolso autorizador) {
            this.autorizador = autorizador;
        }

        public double calcularReembolso(Consulta consulta, PlanoSaude planoSaude) {
            if (!autorizador.isAutorizado(consulta.getPaciente(), consulta.getValor())) {
                throw new IllegalArgumentException("Reembolso não autorizado para " + consulta.getPaciente());
            }
            return consulta.getValor() * planoSaude.getPercentualCobertura();
        }
    }

    /**
     * Helper para criar uma consulta padrão.
     */
    public static Consulta criarConsultaPadrao() {
        return new Consulta("Paciente Teste", 200.0);
    }
}