package game;

/**
 * Created by Stephan on 08.11.2015.
 */
public class Difficulty {
    
	private final String name;
	private final int enemyHp;
	private final int enemySpawnIntervallMs;
	
	public Difficulty(String name, int enemyHp, int enemySpawnIntervallMs) {
		this.name = name;
		this.enemyHp = enemyHp;
		this.enemySpawnIntervallMs = enemySpawnIntervallMs;
	}
	
	public int getEnemyHp() {
		return enemyHp;
	}
	
	public int getEnemySpawnIntervallMs() {
		return enemySpawnIntervallMs;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Difficulty [name=" + name + ", enemyHp=" + enemyHp
				+ ", enemySpawnIntervallMs=" + enemySpawnIntervallMs + "]";
	}

	
}
