package com.example.Pr14.dao;

import com.example.Pr14.models.Bank;
import com.example.Pr14.models.Card;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CardDao {

    private List<Card> cards = new ArrayList<>();

    public void save(Card card) {
        cards.add(card);
    }

    public void delete(int cardNumber) {
        cards.removeIf(card -> card.getCardNumber() == cardNumber);
    }

    public List<Card> getAllCards() {
        return cards;
    }

}
