package com.game.magicalarena;

import org.junit.Test;

import com.game.player.Player;

import static org.junit.Assert.*;

public class ArenaTest {

    @Test
    public void fight() {
        Game arena = new Arena();

        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        int[] fightResults = arena.fight(playerA.getAttack(), playerB.getStrength(), playerB.getHealth());

        assertEquals(0, fightResults[0]);
        assertEquals(100, fightResults[1]);
    }

    @Test
    public void attack() {
        Game arena = new Arena();

        Player playerA = new Player("Player A", 50, 5, 10);

        int attackingPower = arena.attack(playerA.getAttack(), 4);

        assertEquals(40, attackingPower);
    }

    @Test
    public void defend() {
        Game arena = new Arena();

        Player playerB = new Player("Player B", 100, 10, 5);

        int defendingStrength = arena.defend(playerB.getStrength(), 6);

        assertEquals(60, defendingStrength);
    }

    @Test
    public void winnerDeclaration() {
        Game arena = new Arena();

        Player playerA = new Player("Player A", 0, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        Player winner = arena.winnerDeclaration(playerA, playerB);

        assertEquals(playerB, winner);
    }
}
