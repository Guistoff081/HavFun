/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
atributos do banco, codigo, codigo do produto....
 */
package model;

/**
 *
 * @author admin.elisson
 */
public class Equipamento {
    /* essa  classe realiza as chamadas dos métodos para a realiação do cadastro dos equipamentos */
    private String id_equipamento;
    private String descricao_equipamento;
    private double preco_hora;

    public String getCodigo_equipamento() {
        return id_equipamento;
    }

    public void setCodigo_equipamento(String id_equipamento) {
        this.id_equipamento = id_equipamento;
    }

    public String getDescricao_equipamento() {
        return descricao_equipamento;
    }

    public void setDescricao_equipamento(String descricao_equipamento) {
        this.descricao_equipamento = descricao_equipamento;
    }

    public double getPreco_hora() {
        return preco_hora;
    }

    public void setPreco_hora(double preco_hora) {
        this.preco_hora = preco_hora;
    }

    
    

}
