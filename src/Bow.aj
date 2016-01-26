import game.Weapon;
import game.WeaponInventory;

import java.util.List;


public privileged aspect Bow {
	List<Weapon> around(): execution(private List<Weapon> WeaponInventory.getWeapons()) {
		List<Weapon> tmp = proceed();
		tmp.add(new Weapon("Bow", 10, 10, "bow.png"));
		return tmp;
	}
}
