/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Muskan 
 */

public class CardTrick {
    
    public static void main(String[] args) {
        //Muskan Muskan 991707407
        String luckyCard = "King of Hearts";
        String[] cards = generateRandomCards();

        Scanner scanner = new Scanner(System.in);

        // Ask the user to pick a card.
        System.out.print("Pick a card (e.g., Ace of Spades): ");
        String userCard = scanner.nextLine();

        // Search for the user's card in the array of random cards.
        boolean found = false;
        for (String card : cards) {
            if (card.equalsIgnoreCase(userCard)) {
                found = true;
                break;
            }
        }

        // Display the result.
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }

    // Helper method to generate random cards.
    private static String[] generateRandomCards() {
        String[] cardValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cardSuits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        Random random = new Random();
        String[] cards = new String[7];

        for (int i = 0; i < 7; i++) {
            int valueIndex = random.nextInt(cardValues.length);
            int suitIndex = random.nextInt(cardSuits.length);

            String randomCard = cardValues[valueIndex] + " of " + cardSuits[suitIndex];

            cards[i] = randomCard;
        }

        return cards;
    }
}