package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PacienteClinicoTeste {

    @Test
    void deveConsultarPacienteClinico() {
        IPaciente pacienteServico = PacienteService.obterServico("Clinico");
        assertEquals("Consultando paciente clínico...", pacienteServico.consultar());
    }
    @Test
    void deveInternarPacienteClinico() {
        IPaciente pacienteServico = PacienteService.obterServico("Clinico");
        assertEquals( "Internando paciente clínico...", pacienteServico.internar());
    }

}