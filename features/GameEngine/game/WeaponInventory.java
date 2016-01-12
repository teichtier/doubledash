package game;

import game.Weapon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TODO description
 */
public class WeaponInventory {
	
	private final List<Weapon> weapons;
	private int selectedWeaponIndex = 0;
	
	public WeaponInventory () {
		this.weapons = Collections.unmodifiableList(getWeapons());
	}
	
	private List<Weapon> getWeapons() {
		List<Weapon> weapons = new ArrayList<Weapon>();
		
		return weapons;
	}
	
	public List<Weapon> getAvailableWeapons() {
		return weapons;
	}
	
	public Weapon getSelectedWeapon() {
		return weapons.get(selectedWeaponIndex);
	}
	
	public Weapon selectNextWeapon() {
		this.selectedWeaponIndex = (selectedWeaponIndex + 1) % weapons.size();
		return weapons.get(selectedWeaponIndex);
	}
	

}