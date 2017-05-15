package de.sb.emojitracker;

public class Emoji {
	private String character;
	private String id;
	private String name;
	private long score;
	
	public Emoji(){
		super();
	}
	
	public Emoji(String character, String id, String name, long score) {
		super();
		this.character = character;
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}

}
