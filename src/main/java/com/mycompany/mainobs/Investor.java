/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainobs;

/**
 *
 * @author fleme
 */
public class Investor implements IInvestor{
    public Investor(String name, IBroker broker) {
        this.name = name;
        this.broker = broker;
    }
    private String name;
    private IBroker broker;


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void showAllAcoes() {
        this.broker.showAllAcoes();
    }

    @Override
    public void buyAcao(Acao acao) {
        this.broker.buyAcao(acao);
    }

    @Override
    public void sellAcao(Acao acao) {
        this.broker.sellAcao(acao);
    }

    @Override
    public void setPriceForBuy(double price, Acao acao) {
        this.broker.setPriceForBuy(price, acao);
    }

    @Override
    public void setPriceForSell(double price, Acao acao) {
        this.broker.setPriceForSell(price, acao);
    }

}
