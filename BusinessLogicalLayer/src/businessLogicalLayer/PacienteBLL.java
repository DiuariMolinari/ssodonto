/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogicalLayer;

import dataAccessLayer.PacienteDAL;
import domain.Paciente;
import java.util.List;

/**
 *
 * @author Marciele
 */
public class PacienteBLL {

    PacienteDAL dal = new PacienteDAL();

    //Incluir um registro
    public String Inserir(Paciente paciente) {
        StringBuilder builder = new StringBuilder();

        if (paciente.getNome().isBlank() || paciente.getNome().isEmpty() || paciente.getNome().length() == 0) {
            builder.append("O nome do paciente deve ser informado.");
        }

        if (paciente.getNome().length() > 60) {
            builder.append("O nome do paciente não pode conter mais que 60 caracteres.");
        }

        if (paciente.getSobrenome().isBlank() || paciente.getSobrenome().isEmpty() || paciente.getSobrenome().length() == 0) {
            builder.append("O sobrenome do paciente deve ser informado.");
        }

        if (paciente.getSobrenome().length() > 60) {
            builder.append("O sobrenome do paciente não pode conter mais que 60 caracteres.");
        }

        if (paciente.getRg().isBlank() || paciente.getRg().isEmpty() || paciente.getRg().length() == 0) {
            builder.append("O RG deve ser informado.");
        }

        if (paciente.getRg().length() > 20) {
            builder.append("O RG não pode conter mais que 20 caracteres.");
        }

        if (paciente.getCpf().isBlank() || paciente.getCpf().isEmpty() || paciente.getCpf().length() == 0) {
            builder.append("O CPF deve ser informado.");
        }

        if (paciente.getCpf().length() > 14) {
            builder.append("O CPF não pode conter mais que 14 caracteres.");
        }

        if (paciente.getDataNascimento().equals("") || paciente.getDataNascimento() == null) {
            builder.append("A data de nascimento do paciente deve ser informado.");
        }

        if (paciente.getObservacao().isBlank() || paciente.getObservacao().isEmpty() || paciente.getObservacao().length() == 0) {
            builder.append("As observações do paciente deve ser informado.");
        }

        if (paciente.getObservacao().length() > 250) {
            builder.append("As observações do paciente não pode conter mais que 250 caracteres.");
        }

        if (builder.length() != 0) {
            return builder.toString();
        }
        String respostaDB = dal.Inserir(paciente);
        return respostaDB;
    }

    // Obter todos os registros
    public List<Paciente> LerTodos() {
        return dal.LerTodos();
    }

    //Atualizar um registro existente
    public String Atualizar(Paciente paciente) {
        StringBuilder builder = new StringBuilder();

       if (paciente.getNome().isBlank() || paciente.getNome().isEmpty() || paciente.getNome().length() == 0) {
            builder.append("O nome do paciente deve ser informado.");
        }

        if (paciente.getNome().length() > 60) {
            builder.append("O nome do paciente não pode conter mais que 60 caracteres.");
        }

        if (paciente.getSobrenome().isBlank() || paciente.getSobrenome().isEmpty() || paciente.getSobrenome().length() == 0) {
            builder.append("O sobrenome do paciente deve ser informado.");
        }

        if (paciente.getSobrenome().length() > 60) {
            builder.append("O sobrenome do paciente não pode conter mais que 60 caracteres.");
        }

        if (paciente.getRg().isBlank() || paciente.getRg().isEmpty() || paciente.getRg().length() == 0) {
            builder.append("O RG deve ser informado.");
        }

        if (paciente.getRg().length() > 20) {
            builder.append("O RG não pode conter mais que 20 caracteres.");
        }

        if (paciente.getCpf().isBlank() || paciente.getCpf().isEmpty() || paciente.getCpf().length() == 0) {
            builder.append("O CPF deve ser informado.");
        }

        if (paciente.getCpf().length() > 14) {
            builder.append("O CPF não pode conter mais que 14 caracteres.");
        }

        if (paciente.getDataNascimento().equals("") || paciente.getDataNascimento() == null) {
            builder.append("A data de nascimento do paciente deve ser informado.");
        }

        if (paciente.getObservacao().isBlank() || paciente.getObservacao().isEmpty() || paciente.getObservacao().length() == 0) {
            builder.append("As observações do paciente deve ser informado.");
        }

        if (paciente.getObservacao().length() > 250) {
            builder.append("As observações do paciente não pode conter mais que 250 caracteres.");
        }

        String respostaDB = dal.Atualizar(paciente);
        return respostaDB;
    }

    //Excluir um registro
    public String Deletar(Paciente paciente) {
        String respostaDB = dal.Deletar(paciente);
        return respostaDB;
    }

    //TODO: Obter um registro
}
