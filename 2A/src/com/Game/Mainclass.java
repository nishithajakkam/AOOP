package com.Game;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game_state gameState = Game_state.getInstance();

        gameState.setLevel(1);
        gameState.addScore(0);

        EnemyFactory enemyFactory = EnemyFactory.getFactory(gameState.getLevel());
        TheEnemy enemy = enemyFactory.createEnemy();

        Weapons weapon = (Weapons) new Sword();
        Power_up powerUp = new Health_pack();

        System.out.println("Game started at level " + gameState.getLevel());
        enemy.attacking();
        weapon.use();
        powerUp.activate();

        gameState.addScore(100);
        System.out.println("Score: " + gameState.getScore());


	}

}
