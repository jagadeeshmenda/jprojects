package com.jaga.classes;

public class FlowTrackingModel {
	String messageId;
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public int getPidId() {
		return pidId;
	}
	public void setPidId(int pidId) {
		this.pidId = pidId;
	}
	public String getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getResponseId() {
		return ResponseId;
		
	}
	public void setResponseId(String responseId) {
		ResponseId = responseId;
	}
	public String getSomeotherId() {
		return someotherId;
	}
	public void setSomeotherId(String someotherId) {
		this.someotherId = someotherId;
	}
	int pidId;
	String notificationId; 
	String requestId ;
	String ResponseId; 
	String someotherId;
}
