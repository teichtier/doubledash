
import game.Character;
import game.CharacterPool;

import java.util.List;

public privileged aspect Chantal {

	List<Character> around(): execution(private List<Character> CharacterPool.getCharacters()) {
		List<Character> tmp = proceed();
		tmp.add(new Character("Chantal", 75, "chantal.png"));
		return tmp;
	}
}
