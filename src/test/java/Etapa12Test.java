import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.example.Etapa12;
import org.example.repository.AutorizadorReembolso;
import org.junit.jupiter.api.Test;

public class Etapa12Test {

    /**
     * Stub para simular um plano de saúde com 70% de cobertura.
     */
    static class PlanoSaudeStub implements Etapa12.PlanoSaude {
        @Override
        public double getPercentualCobertura() {
            return 0.7;
        }
    }

    @Test
    void deveCalcularReembolsoComIntegracaoDeDublês() {
        // Criando mock corretamente da interface separada AutorizadorReembolso
        AutorizadorReembolso autorizadorMock = mock(AutorizadorReembolso.class);
        when(autorizadorMock.isAutorizado("Paciente Teste", 200.0)).thenReturn(true);

        // Criando stub para PlanoSaude
        Etapa12.PlanoSaude planoStub = new PlanoSaudeStub();

        // Criando sistema e consulta padrão
        Etapa12.SistemaReembolso sistema = new Etapa12.SistemaReembolso(autorizadorMock);
        Etapa12.Consulta consulta = Etapa12.criarConsultaPadrao();

        // Executando o cálculo de reembolso
        double resultado = sistema.calcularReembolso(consulta, planoStub);

        // Validando que o cálculo está correto
        assertEquals(140.0, resultado, 0.01);
    }

    @Test
    void deveLancarExcecaoQuandoReembolsoNaoAutorizado() {
        // Criando mock corretamente da interface separada AutorizadorReembolso
        AutorizadorReembolso autorizadorMock = mock(AutorizadorReembolso.class);
        when(autorizadorMock.isAutorizado("Paciente Teste", 200.0)).thenReturn(false);

        // Criando stub para PlanoSaude
        Etapa12.PlanoSaude planoStub = new PlanoSaudeStub();

        // Criando sistema e consulta padrão
        Etapa12.SistemaReembolso sistema = new Etapa12.SistemaReembolso(autorizadorMock);
        Etapa12.Consulta consulta = Etapa12.criarConsultaPadrao();

        // Garantindo que exceção é lançada ao tentar reembolso não autorizado
        assertThrows(IllegalArgumentException.class, () -> {
            sistema.calcularReembolso(consulta, planoStub);
        });
    }
}