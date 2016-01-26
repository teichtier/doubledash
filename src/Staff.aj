import game.Weapon;
import game.WeaponInventory;

import java.util.List;


public privileged aspect Staff {
	List<Weapon> around(): execution(private List<Weapon> WeaponInventory.getWeapons()) {
		List<Weapon> tmp = proceed();
		tmp.add(new Weapon("Staff", 50, 5, "staff.png"));
		return tmp;
	}
}
