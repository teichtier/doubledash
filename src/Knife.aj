import game.Weapon;
import game.WeaponInventory;

import java.util.List;


public privileged aspect Knife {
	List<Weapon> around(): execution(private List<Weapon> WeaponInventory.getWeapons()) {
		List<Weapon> tmp = proceed();
		tmp.add(new Weapon("Knife", 100, 1, "knife.png"));
		return tmp;
	}
}
