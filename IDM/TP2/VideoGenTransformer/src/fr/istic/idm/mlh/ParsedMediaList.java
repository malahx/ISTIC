package fr.istic.idm.mlh;

import java.util.ArrayList;
import java.util.List;

public class ParsedMediaList {

	private int id;
	
	private List<ParsedMedia> parsedMedias = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ParsedMedia> getParsedMedias() {
		return parsedMedias;
	}

	public void setParsedMedias(List<ParsedMedia> parsedMedias) {
		this.parsedMedias = parsedMedias;
	}
	
}
