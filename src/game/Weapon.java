package game;

/**
 * @since 16.11.2015
 */
public class Weapon {
   
	private final String name; 
    private final int damage;
    private final int range;
    private final String spriteName;

    public Weapon(String name, int damage, int range, String spriteName) {
    	this.name = name;
        this.damage = damage;
        this.range = range;
        this.spriteName = spriteName;
    }
    
    public String getName() {
		return name;
	}

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public String getSpriteName() {
        return spriteName;
    }

	@Override
	public String toString() {
		return "Weapon [name=" + name + ", damage=" + damage + ", range="
				+ range + ", spriteName=" + spriteName + "]";
	}
}
