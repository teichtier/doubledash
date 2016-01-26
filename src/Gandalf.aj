
import game.Character;
import game.CharacterPool;

import java.util.List;

public privileged aspect Gandalf {

	List<Character> around(): execution(private List<Character> CharacterPool.getCharacters()) {
		List<Character> tmp = proceed();
		tmp.add(new Character("Gandalf", 100, "gandalf.png"));
		return tmp;
	}
}
