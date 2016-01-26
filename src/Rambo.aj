
import game.Character;
import game.CharacterPool;

import java.util.List;

public privileged aspect Rambo {

	List<Character> around(): execution(private List<Character> CharacterPool.getCharacters()) {
		List<Character> tmp = proceed();
		tmp.add(new Character("Rambo", 50, "rambo.png"));
		return tmp;
	}
}
