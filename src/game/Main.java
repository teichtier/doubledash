package game;

import gui.MainGui;

public class Main {

    public static DashParameters parameters;

    public static void main(String[] args) {

        DashParameters.DashParametersBuilder builder = DashParameters.builder();

        String character = builder.getValueOfParameter(args, "char");
        if (character != null)
        	builder.character(character);
        
        String weapon = builder.getValueOfParameter(args, "weapon");
        if (character != null)
        	builder.weapon(weapon);
        
        String difficulty = builder.getValueOfParameter(args, "difficulty");
        if (difficulty != null)
        	builder.difficulty(difficulty);
        
        String language = builder.getValueOfParameter(args, "language");
        if (language != null)
        	builder.langType(language);
        
        String direction = builder.getValueOfParameter(args, "direction");
        if (direction != null)
        	builder.direction(direction);
        
        String multiplayer = builder.getValueOfParameter(args, "multiplayer");
        if (multiplayer != null && multiplayer.equalsIgnoreCase("y"))
        	builder.numberOfPlayers(2);
        
        parameters = builder.build();
        System.out.println(parameters);
        new MainGui();
    }

}
