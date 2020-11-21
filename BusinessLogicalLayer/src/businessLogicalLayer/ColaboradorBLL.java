/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogicalLayer;

import dataAccessLayer.ColaboradorDAL;
import domain.Colaborador;
import java.util.List;

/**
 *
 * @author Marciele
 */
public class ColaboradorBLL {

    //TODO: Obter um registro
    ColaboradorDAL dal = new ColaboradorDAL();

    //Incluir um registro
    public String Inserir(Colaborador colaborador) {
        StringBuilder builder = new StringBuilder();

        if (colaborador.getNome().isEmpty() || colaborador.getNome().trim().length() == 0) {
            builder.append("O nome do colaborador deve ser informado.");
        }

        if (colaborador.getNome().length() > 100) {
            builder.append("O nome do colaborador não pode conter mais que 100 caracteres.");
        }

        if (colaborador.getCro().isEmpty() || colaborador.getCro().trim().length() == 0) {
            builder.append("O CRO deve ser informada.");
        }
        if (colaborador.getCro().length() > 10) {
            builder.append("O CRO não pode conter mais que 10 caracteres.");
        }

        if (colaborador.getCroEstado().isEmpty() || colaborador.getCroEstado().trim().length() == 0) {
            builder.append("O estado do CRO deve ser informado.");
        }

        if (colaborador.getCroEstado().length() > 2) {
            builder.append("O estado do CRO não pode conter mais que 2 caracteres.");
        }

        if (colaborador.getDataAdmissao().equals("") || colaborador.getDataAdmissao() == null) {
            builder.append("A data de admissão deve ser informado.");
        }

        if (builder.length() != 0) {
            return builder.toString();
        }
        String respostaDB = dal.Inserir(colaborador);
        return respostaDB;
    }

    // Obter todos os registros
    public List<Colaborador> LerTodos() {
        return dal.LerTodos();
    }

    //Atualizar um registro existente
    public String Atualizar(Colaborador colaborador) {
        StringBuilder builder = new StringBuilder();

        if (colaborador.getNome().isEmpty() || colaborador.getNome().trim().length() == 0) {
            builder.append("O nome do colaborador deve ser informado.");
        }

        if (colaborador.getNome().length() > 50) {
            builder.append("O nome do colaborador não pode conter mais que 50 caracteres. ");
        }

        if (colaborador.getCro().isEmpty() || colaborador.getCro().trim().length() == 0) {
            builder.append("O CRO deve ser informada.");
        }

        if (colaborador.getCro().length() > 50) {
            builder.append("O CRO não pode conter mais que 50 caracteres. ");
        }

        if (colaborador.getCroEstado().isEmpty() || colaborador.getCroEstado().trim().length() == 0) {
            builder.append("O estado do CRO deve ser informada.");
        }

        if (colaborador.getCroEstado().length() > 2) {
            builder.append("O estado do CRO não pode conter mais que 2 caracteres. ");
        }

        if (colaborador.getDataAdmissao().equals("") || colaborador.getDataAdmissao() == null) {
            builder.append("A data de admissão deve ser informada.");
        }

        if (builder.length() != 0) {
            return builder.toString();
        }

        String respostaDB = dal.Atualizar(colaborador);
        return respostaDB;
    }

    //Excluir um registro
    public String Deletar(Colaborador colaborador) {
        String respostaDB = dal.Deletar(colaborador);
        return respostaDB;
    }
}