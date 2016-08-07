package dto;

public class book {
	
	private int idbooks;
	private String name;
	private String description;
	private int wormId;
	
	public book() {
		
	}
	
	
	public book(int idbooks, String name, String description, int wormId) {
		super();
		this.idbooks = idbooks;
		this.name = name;
		this.description = description;
		this.wormId = wormId;
	}


	public int getIdbooks() {
		return idbooks;
	}


	public void setIdbooks(int idbooks) {
		this.idbooks = idbooks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getWormId() {
		return wormId;
	}


	public void setWormId(int wormId) {
		this.wormId = wormId;
	}


}
