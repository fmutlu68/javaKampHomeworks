package nLayeredHomeworkECommerceSystem.core.entities.concretes;

import nLayeredHomeworkECommerceSystem.core.entities.Entity;

public class VerificationMessage implements Entity{
	private int id;
	private int userId;
	private String message;
	private String verificationLink;
	private boolean isVerified;
	
	public VerificationMessage() {
		
	}
	
	public VerificationMessage(String message, String verificationLink, boolean isVerified, int id, int userId) {
		this.message = message;
		this.verificationLink = verificationLink;
		this.isVerified = isVerified;
		this.setId(id);
		this.userId = userId;
	}
	public VerificationMessage(String message, String verificationLink, boolean isVerified, int userId) {
		this.message = message;
		this.verificationLink = verificationLink;
		this.isVerified = isVerified;
		this.userId = userId;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getVerificationLink() {
		return verificationLink;
	}
	public void setVerificationLink(String verificationLink) {
		this.verificationLink = verificationLink;
	}
	public boolean isVerified() {
		return isVerified;
	}
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	
}
