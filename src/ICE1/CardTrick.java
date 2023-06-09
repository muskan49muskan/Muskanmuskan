/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ICE1;

import card.Card;
import java.util.Scanner;
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(generateRandomNumber());
            c.setSuit(Card.SUITS[generateRandomNumber(0, 3)]);
            magicHand[i] = c;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of your card (0-3 where 0 = Hearts, 1 = Diamonds, 2 = Clubs, 3 = Spades): ");
        int suit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);

        boolean found = false;
        for(Card card : magicHand) {
            if(card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Well done! Your card is in the magic hand.");
        } else {
            System.out.println("your card is not in the magic hand.");
        }
    }

    private static int generateRandomNumber() {
        return (int) (Math.random() * 13 + 1);
    }

    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
