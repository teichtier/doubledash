package game;

public class Language {

	private final String name;
	
	public Language(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Language [name=" + name + "]";
	}
}
