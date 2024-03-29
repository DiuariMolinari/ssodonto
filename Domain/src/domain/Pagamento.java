/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.time.LocalDate;

/**
 *
 * @author Diuari
 */
public class Pagamento {
    private int id;
    private LocalDate dataPagamento;
    private TipoPagamento tipoPagamento;

     @Override
    public String toString() {
        return String.valueOf(id);
    }
    public Pagamento(int id) {
        this.id = id;
    }
    
    public Pagamento(int id, LocalDate dataPagamento, TipoPagamento tipoPagamento) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.tipoPagamento = tipoPagamento;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
