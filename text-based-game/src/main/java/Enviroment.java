import java.util.ArrayList;

public class Enviroment {

	private String name;
	private String description;
	private String listOfActions;
	private ArrayList<Interactable> listOfInteractables;
	
	public Enviroment(String name, String description, ArrayList<Actionable> listOfActions,
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
		return String.format(description, listOfInteractables);
	}
}

