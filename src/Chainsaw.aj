import game.Weapon;
import game.WeaponInventory;

import java.util.List;

public privileged aspect Chainsaw {

	private static final String SPRITE_NAME_BASE = "chainsaw_";
	private int frameIndex = 0;

	List<Weapon> around(): execution(private List<Weapon> WeaponInventory.getWeapons()) {
		List<Weapon> tmp = proceed();
		tmp.add(new Weapon("Chainsaw", 75, 2, "chainsaw_1.png"));
		return tmp;
	}

	String around(Weapon weapon): execution(public String getSpriteName()) && this(weapon){
		if ("Chainsaw".equals(weapon.getName())) {
			frameIndex = (frameIndex + 1) % 2;
			return SPRITE_NAME_BASE + frameIndex + ".png";
		} else {
			return proceed(weapon);
		}
	}
}
