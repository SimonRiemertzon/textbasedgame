import java.util.ArrayList;

public class Environment {

    private String name;
    private String description;
    private ArrayList<String> listOfActions;
    private ArrayList<Interactable> listOfInteractables;

    public Environment(String name, String description, ArrayList<Interactable> listOfInteractables,
                      ArrayList<String> listOfActions) {
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
        sb.append(description + "\n");
        for (Interactable interactive : listOfInteractables
        ) {
            sb.append(" " + interactive.getName() + "\n");
        }
        sb.append("What would you like to do? \n");

        for (int i = 0; i < listOfActions.size() ; i++) {
            sb.append((i + 1) + " " + listOfActions.get(i));
        }
        return sb.toString();
    }
    
    public void doActionsWith(int choice, Player player) {
    	final Interactable chosenAction = getChosenAction(choice);
    	System.out.println(choice);
    }
}

