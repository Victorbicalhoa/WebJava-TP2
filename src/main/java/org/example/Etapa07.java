package org.example;

public class Etapa07 {
    public interface Auditoria {
        void registrarConsulta(String paciente, double valor, double cobertura);
    }

    public static class AuditoriaReal implements Auditoria {
        @Override
        public void registrarConsulta(String paciente, double valor, double cobertura) {
            // Aqui simulamos um registro, mas poderia ser um log ou banco de dados
            System.out.println("Consulta registrada: Paciente: " + paciente + ", Valor: " + valor + ", Cobertura: " + cobertura);
        }
    }

    public static class SistemaReembolso {
        private final Auditoria auditoria;

        public SistemaReembolso(Auditoria auditoria) {
            this.auditoria = auditoria;
        }

        public double calcularReembolso(String paciente, double valorConsulta, double percentualCobertura) {
            double reembolso = valorConsulta * percentualCobertura;
            auditoria.registrarConsulta(paciente, valorConsulta, percentualCobertura);
            return reembolso;
        }
    }
}