package game;

import game.Weapon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TODO description
 */
public class WeaponInventory {

	private List<Weapon> getWeapons() {
		List<Weapon> weapons = original();
		weapons.add(new Weapon("Staff", 50, 5, "staff.png"));
		return weapons;
	}
}