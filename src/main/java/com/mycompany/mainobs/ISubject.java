/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mainobs;

/**
 *
 * @author fleme
 */
public interface ISubject {

    void addObserver(IObserver obs);
    void removeObserver(IObserver obs);
    void notifyObservers();
}
