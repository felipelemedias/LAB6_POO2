/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mainobs;

/**
 *
 * @author fleme
 */
public interface IInvestor {
    String getName();
    void showAllAcoes();
    void buyAcao(Acao acao);
    void sellAcao(Acao acao);
    void setPriceForBuy(double price, Acao acao);
    void setPriceForSell(double price, Acao acao);
}
