/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogicalLayer;

import dataAccessLayer.AtendimentoDAL;
import domain.Atendimento;
import java.util.List;

/**
 *
 * @author Marciele
 */
public class AtendimentoBLL {

    AtendimentoDAL dal = new AtendimentoDAL();

    //Incluir um registro
    public String Inserir(Atendimento atendimento) {
        StringBuilder builder = new StringBuilder();

        if (atendimento.getQtdProcedimento() < 0 || atendimento.getQtdProcedimento() != 0) {
            builder.append("A quantidade de procedimento deve ser informado.");
        }

        if (builder.length() != 0) {
            return builder.toString();
        }
        String respostaDB = dal.Inserir(atendimento);
        return respostaDB;
    }

    // Obter todos os registros
    public List<Atendimento> LerTodos() {
        return dal.LerTodos();
    }

    //Atualizar um registro existente
    public String Atualizar(Atendimento atendimento) {
        StringBuilder builder = new StringBuilder();

        if (atendimento.getQtdProcedimento() < 0 || atendimento.getQtdProcedimento() != 0) {
            builder.append("A quantidade de procedimento deve ser informado.");
        }

        if (builder.length() != 0) {
            return builder.toString();
        }

        String respostaDB = dal.Atualizar(atendimento);
        return respostaDB;
    }

    //Excluir um registro
    public String Deletar(Atendimento atendimento) {
        String respostaDB = dal.Deletar(atendimento);
        return respostaDB;
    }

    //TODO: Obter um registro    
}