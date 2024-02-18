package com.game.magicalarena;

import com.game.player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArenaTest {

    @Test
    void fight() {
        Game arena = new Arena();

        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        int[] fightResults = arena.fight(playerA.getAttack(), playerB.getStrength(), playerB.getHealth());

        assertEquals(0, fightResults[0]); // Since attack is less than defend strength, damage should be 0
        assertEquals(100, fightResults[1]); // Check if health reduction is correct
    }

    @Test
    void attack() {
        Game arena = new Arena();

        Player playerA = new Player("Player A", 50, 5, 10);

        int attackingPower = arena.attack(playerA.getAttack(), 4);

        assertEquals(20, attackingPower); // Check if attacking power calculation is correct
    }

    @Test
    void defend() {
        Game arena = new Arena();

        Player playerB = new Player("Player B", 100, 10, 5);

        int defendingStrength = arena.defend(playerB.getStrength(), 6);

        assertEquals(60, defendingStrength); // Check if defending strength calculation is correct
    }

    @Test
    void winnerDeclaration() {
        Game arena = new Arena();

        Player playerA = new Player("Player A", 0, 5, 10); // Player A has 0 health
        Player playerB = new Player("Player B", 100, 10, 5);

        Player winner = arena.winnerDeclaration(playerA, playerB);

        assertEquals(playerB, winner); // Check if player B is declared as the winner
    }
}
