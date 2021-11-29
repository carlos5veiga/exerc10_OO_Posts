package entities;

public class Comment {
	private String text;
	
	public Comment() {
		
	}
	
	public Comment(String text) {
		this.text = text;
	}

	public void setComment(String comment) {
		text = comment;
	}
	
	public String getComment() {
		return text;
	}
}
