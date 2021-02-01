import java.util.ArrayList;

public class Enviroment {

	private String name;
	private String description;
	private ArrayList<Actionable> listOfActions;
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

	
    
    
    
   /** 
    -name
    -description
    -listOfActions
    -listOfInteractables

    +getdescription()
    +getName() 
    */
}

/**
 ArrayList<String> areas = new ArrayList<String>();
 
areas.add("Dark room");

ArrayList<String> objects = new ArrayList<String>();
objects.add("key");
objects.add("window");
objects.add("table");
objects.add("door");
*/