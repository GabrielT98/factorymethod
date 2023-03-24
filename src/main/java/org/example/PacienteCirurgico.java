package org.example;

class PacienteCirurgico implements IPaciente {
    public String consultar() {
        return "Consultando paciente cirúrgico...";
    }

    public String internar() {
        return "Internando paciente cirúrgico...";
    }
}