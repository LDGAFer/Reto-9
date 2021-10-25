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
public class Main {
  
    public static void main (String []) {
        
        String[] palo = {"Pika","Corazon","Diamante","Trebol"};
        String[] valor = {"A","2","3","4","5","6","7","8","9","10","J","Q","K",};
        Integer cont = 1;
        Deck deck= new Deck();
        deck.setCard(new ArrayList<Card>());
        for (int i = 0; i < palo.length; i++){
            for (int j = 0; j < valor.length; j++){
                Card card = new Card(palo[i],getColor(palo[i]),valor[j]);
                deck.getCard().add(card);
                
            }
        }
        System.out.println("El tamaño del deck es:" + deck.getCard().size());
        System.out.println("Mezclar Deck\n" + deck.mezclar());
        }
        
        System.out.println("El tamaño del deck es:" + deck.getCard().size());{
        System.out.println("Barajar Deck\n" + deck.mezclar());
        }
    }
    
        System.out.println("El tamaño del deck es:" + deck.getCard().size());{
        System.out.println("random Deck\n" + deck.mezclar());
        }
        
          } 
       
    // Código del controlador 
    public static void main(String[] args){ 
        
    
    public static String getColor(string palo){
        if(palo.tolowercase().equals("pika") || palo.toLowercase().equals("Trebol")){
            return "negro";
        }
        if(palo.toLowercase(Locale.ITALY).equals("corazon") || palo.toLowercase().equals("Diamante")){
            return "rojo";
        }
        
        return null;
    }
}

public class Example {

    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println("Bienvenido a Poker, seleccione una opción" + args[0]);
        System.out.println("Mezclar Deck" + args[1]);
        System.out.println("Sacar una carta" + args[2]);
        System.out.println("Carta al azar" + args[3]);
        System.out.println("Generar una mano de 5 cartas" + args[4]);
        System.out.println("Salir" + args[0]);

    }

}