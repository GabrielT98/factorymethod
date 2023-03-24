package org.example;
public class PacienteService {
    public static IPaciente obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Paciente" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IPaciente)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IPaciente) objeto;
    }
}