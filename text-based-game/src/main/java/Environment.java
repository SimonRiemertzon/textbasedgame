import java.util.ArrayList;

/**
 * Creates an environment with a name, description and a listOfInteractables consisting of different interactable objects.
 * The environment is where the player can interact with objects in the game. 
 * */
public class Environment {

    private String name;
    private String description;
    private ArrayList<Interactable> listOfInteractables;

    public Environment(String name, String description, ArrayList<Interactable> listOfInteractables
    ) {
        super();
        this.name = name;
        this.description = description;
        this.listOfInteractables = listOfInteractables;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Interactable> getListOfInteractables() {
        return listOfInteractables;
    }
    
    /**
     * Returns a String consisting of the description of a Environment and the different interactive options for the current environment. 
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(description + "\n");
        for (Interactable interactive : listOfInteractables
        ) {
            sb.append(" " + interactive.getName() + "\n");
        }
        return sb.toString();
    }

}

