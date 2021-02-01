import java.util.ArrayList;

public class Environment {

	private String name;
	private String description;
	private String listOfActions;
	private ArrayList<Interactable> listOfInteractables;
	
	public Environment(String name, String description, String listOfActions,
			ArrayList<Interactable> listOfInteractables) {
		super();
		this.name = name;
		this.description = description;
		this.listOfActions = listOfActions;
		this.listOfInteractables = listOfInteractables;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public String getListOfActions() {
		return listOfActions;
	}

	
	
	public String toString() {
		return description + listOfActions + listOfInteractables;
	}
}

