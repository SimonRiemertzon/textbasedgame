import java.util.ArrayList;

public class Enviroment {

	private String name;
	private String description;
	private ArrayList<String> listOfActions;
	private ArrayList<Interactable> listOfInteractables;
	
	public Enviroment(String name, String description, ArrayList<Interactable> listOfInteractables,
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
	
	public String getListOfActions() {
		return listOfActions;
	}

	
	
	public String toString() {
		return String.format(description, listOfInteractables);
	}
}

