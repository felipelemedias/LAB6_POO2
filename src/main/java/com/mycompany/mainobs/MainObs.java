/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainobs;

/**
 *
 * @author fleme
 */

public class MainObs {
    public static void main(String[] args) {

        // Declaração de duas Ações
        Acao ac = new Acao("MAGALU");
        Acao ac2 = new Acao("PETROBRAS");

        Broker broker = new Broker();

        // Adicionando um broker para observar essas ações
        ac2.addObserver(broker);
        ac.addObserver(broker);

        // Broker irá observar as ações atribuido a um investidor
        Investor inv = new Investor("Felipe", broker);

        // Adicionado um preço para vender e comprar as ações, esse valores serão usados pelos broker dentro da classe investidor
        inv.setPriceForSell(250, ac);
        inv.setPriceForBuy(49, ac2);

        // Preço das ações alterados. O broker que já possui as informações de compra e venda de cada ação, irá notificar o investidor quando o preço estiver proximo
        ac.setPrice(89);
        ac2.setPrice(21);

        // Mostra toda as ações que o broker tem em sua base de dados
        inv.showAllAcoes();
    }
}
