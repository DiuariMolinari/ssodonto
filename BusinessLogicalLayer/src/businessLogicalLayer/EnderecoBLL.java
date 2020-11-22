/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogicalLayer;

import dataaccesslayer.EnderecoDAL;
import domain.Endereco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marciele
 */
public class EnderecoBLL {

    EnderecoDAL dal = new EnderecoDAL();

    //Incluir um registro
    public String insert(Endereco endereco) throws Exception {
        StringBuilder builder = new StringBuilder();

        if (endereco.getCep().isEmpty() || endereco.getCep().trim().length() == 0) {
            builder.append("O CEP deve ser informada.");
        }

        if (endereco.getCep().length() > 9) {
            builder.append("O CEP não pode conter mais que 9 caracteres.");
        }

        if (endereco.getNumeroCasa() < 0 || endereco.getNumeroCasa() != 0) {
            builder.append("O número da casa deve ser informado.");
        }

        if (builder.length() != 0) {
            return builder.toString();
        }
        String respostaDB = dal.insert(endereco);
        return respostaDB;
    }

    //Obter todos os registros
    public ArrayList<Endereco> getAll() throws Exception{
        return dal.getAll();
    }

    //Atualizar um registro existente
    public String update(Endereco endereco) throws Exception {
        StringBuilder builder = new StringBuilder();

        if (endereco.getCep().isEmpty() || endereco.getCep().trim().length() == 0) {
            builder.append("O CEP deve ser informada.");
        }

        if (endereco.getCep().length() > 9) {
            builder.append("O CEP não pode conter mais que 9 caracteres. ");
        }

        if (endereco.getNumeroCasa() < 0 || endereco.getNumeroCasa() != 0) {
            builder.append("O número da casa deve ser informado.");
        }

        if (builder.length() != 0) {
            return builder.toString();
        }

        String respostaDB = dal.update(endereco);
        return respostaDB;
    }

    //Excluir um registro
    public String delete(Endereco endereco) throws Exception {
        String respostaDB = dal.delete(endereco);
        return respostaDB;
    }

    //    //Obter um registro
//    public String getById(Endereco endereco) throws Exception {
//
//    }
//
//    //Obter último registro
//    public String getLastRegister(Endereco endereco) throws Exception {
//
//    }
//
//    //Obter registros de determinado estado
//    public ArrayList<Endereco> getByLogradouro(Endereco endereco) throws Exception {
//
//    }
}
