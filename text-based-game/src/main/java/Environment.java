import java.util.ArrayList;

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

