package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PacienteCirurgicoTeste {

    @Test
    void deveConsultarPacienteCirurgico() {
        IPaciente pacienteServico = PacienteService.obterServico("Cirurgico");
        assertEquals("Consultando paciente cirúrgico...", pacienteServico.consultar());
    }
    @Test
    void deveInternarPacienteCirurgico() {
        IPaciente pacienteServico = PacienteService.obterServico("Cirurgico");
        assertEquals( "Internando paciente cirúrgico...", pacienteServico.internar());
    }

}