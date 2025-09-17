/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. clubs * 13, 4 * 13 = 52 cards
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author srinivsi
 * Modifier: Muhammad Arham
 * Student Number: 991807357
 * Date: September 17, 2025
 */
public class Card { // modelled, card entity

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
   
   
    
}
