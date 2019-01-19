package test;

import java.util.*;
import java.util.stream.Collectors;

public class GetCard {

    public static void main(String [] args){

        Set<Card> deck = new HashSet<>();

        while (deck.size()!=52){
            deck.add(getCard());
        }

        List<Card> decks = deck.stream().collect(Collectors.toList());

        System.out.println(decks);
    }

    public static class Card{

        private Integer number;
        private String color;

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Card card = (Card) o;
            return number.equals(card.number) &&
                    color.equals(card.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(number, color);
        }

        @Override
        public String toString() {
            return "Card{" +
                    "number=" + number +
                    ", color='" + color + '\'' +
                    '}' +'\n';
        }
    }


    public static Card getCard(){

        Card card = new Card();
        Random random = new Random();

        card.setNumber((random.nextInt(13)+1));

            switch (random.nextInt(4)){

            case 0: card.setColor("spade");break;
            case 1:card.setColor("heart");break;
            case 2:card.setColor("diamond");break;
            case 3:card.setColor("club");break;
            default:break;
            }

            return card;
    }

}
