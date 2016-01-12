package game;

public class Character {

	private final String name;
    private final int hp;
    private final String spriteName;

    Character(String name, int hp, String spriteName) {
    	this.name = name;
        this.hp = hp;
        this.spriteName = spriteName;
    }
    
    public String getName() {
		return name;
	}
    
    public int getHp() {
		return hp;
	}
    
    public String getSpriteName() {
		return spriteName;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", hp=" + hp + ", spriteName="
				+ spriteName + "]";
	}
    
    
}
