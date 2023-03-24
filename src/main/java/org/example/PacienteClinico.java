package org.example;

class PacienteClinico implements IPaciente {
    public String consultar() {
        return "Consultando paciente clínico...";
    }

    public String internar() {
       return "Internando paciente clínico...";
    }
}