import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.example.Etapa08;
import org.example.repository.AutorizadorReembolso;
import org.junit.jupiter.api.Test;

public class Etapa08Test {

    @Test
    void deveCalcularReembolsoParaConsultaAutorizada() {
        // Criando um mock da interface AutorizadorReembolso
        AutorizadorReembolso autorizadorMock = mock(AutorizadorReembolso.class);
        when(autorizadorMock.isAutorizado("Victor", 200.0)).thenReturn(true);

        Etapa08.SistemaReembolso sistema = new Etapa08.SistemaReembolso(autorizadorMock);

        // Executando o cálculo de reembolso
        double resultado = sistema.calcularReembolso("Victor", 200.0, 0.7);

        // Validando que o cálculo está correto
        assertEquals(140.0, resultado, 0.01);
    }

    @Test
    void deveLancarExcecaoQuandoReembolsoNaoAutorizado() {
        // Criando um mock da interface AutorizadorReembolso
        AutorizadorReembolso autorizadorMock = mock(AutorizadorReembolso.class);
        when(autorizadorMock.isAutorizado("Victor", 200.0)).thenReturn(false);

        Etapa08.SistemaReembolso sistema = new Etapa08.SistemaReembolso(autorizadorMock);

        // Garantindo que exceção é lançada ao tentar reembolso não autorizado
        assertThrows(IllegalArgumentException.class, () -> {
            sistema.calcularReembolso("Victor", 200.0, 0.7);
        });
    }
}