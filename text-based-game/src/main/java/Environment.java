import java.lang.reflect.Array;
import java.util.ArrayList;

public class Environment {
    
    private String name;
    private String description;
    private ArrayList<String> listOfActions;
    private ArrayList<Interactable> listOfInteractables;

    public Environment(String name, String description, ArrayList<Interactable> listOfInteractables,
                      ArrayList<String> listOfActions
    ) {
        super();
        this.name = name;
        this.description = description;
        this.listOfInteractables = listOfInteractables;
        this.listOfActions = listOfActions;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getListOfActions() {
        return listOfActions;
    }

    public ArrayList<Interactable> getListOfInteractables() {
        return listOfInteractables;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(description);
        for (Interactable interactive : listOfInteractables
        ) {
            sb.append(" " + interactive.getName() + "\n");
        }

        return sb.toString();
    }

}

