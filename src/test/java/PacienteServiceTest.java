package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PacienteServiceTest {
    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IPaciente parcienteservico = PacienteService.obterServico("Emergencia");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IPaciente parcienteservico = PacienteService.obterServico("Eletivo");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}
