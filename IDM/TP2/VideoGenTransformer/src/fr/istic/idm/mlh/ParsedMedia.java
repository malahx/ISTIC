package fr.istic.idm.mlh;

public class ParsedMedia {
	
	private String name;
	private boolean active;
	private String type;
	private int totalAlternative;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTotalAlternative() {
		return totalAlternative;
	}
	public void setTotalAlternative(int totalAlternative) {
		this.totalAlternative = totalAlternative;
	}
}
