/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad8;

/**
 *
 * @author Fernando
 */
public class Card {
    
    private String palo;
    private String color;
    private String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
    
    public Card () {
    }
    

            
    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String setValor(String valor) {
        this.valor = valor;
        return "mezclando..."
    }

    public String setBarajar(String valor) {
        this.Barajar = valor;
        return "barajando..."
    }
    
    public String setRandom(String valor) {
        this.Random = valor;
        return "random..."
    }
}