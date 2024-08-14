package com.MagicalArena.game.Service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.MagicalArena.game.Model.Player;

@Service
public class MagicalArenaService {
	
	private static int generateRandomValueInDice() {
		Random rand = new Random();
		int randomNum = rand.nextInt(6) + 1;
		return randomNum;
	}

	public static String winnerOfMagicalArena(Player a, Player b) {
		int currHealthA = a.getHealth();
		int currHealthB = b.getHealth();
		
		while (currHealthA > 0 || currHealthB > 0) {
			if (currHealthA <= currHealthB) {
				int attackValue = generateRandomValueInDice() * a.getAttack();
				int defendedValue = generateRandomValueInDice() * b.getStrength();
				if (attackValue > defendedValue) {
					currHealthB = currHealthB- (attackValue - defendedValue);
				}
			}

			else // (currHealthA > currHealthB)
				{
				int attackValue = generateRandomValueInDice() * b.getAttack();
				int defendedValue = generateRandomValueInDice() * a.getStrength();
				if (attackValue > defendedValue) {
					currHealthA =currHealthA- (attackValue - defendedValue);
				}
			}
		}
		System.out.println("Current Health A  "+ currHealthA);
		System.out.println("Current Health B  "+ currHealthB);
		if (currHealthA > currHealthB) {
			return " A wins ! ";
		}
		return " B wins !";

	}

}
