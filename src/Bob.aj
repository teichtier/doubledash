
import game.Character;
import game.CharacterPool;

import java.util.List;

public privileged aspect Bob {

	List<Character> around(): execution(private List<Character> CharacterPool.getCharacters()) {
		List<Character> tmp = proceed();
		tmp.add(new Character("Bob", 25, "bob.png"));
		return tmp;
	}
}
