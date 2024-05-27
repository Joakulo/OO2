package ar.edu.unlp.info.oo2.biblioteca;

import java.time.*;
import java.util.*;

public class ToDoItem {
	
	private String name;
	private ToDoItemState state;
	private List<String> comments;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		this.comments = new ArrayList<>();
	}
	
	public void setState(ToDoItemState state) {
		this.state = state;
	}
	
	public void setStartDate(LocalDateTime start) {
		this.startDate = start;
	}
	
	public void setEndDate(LocalDateTime end) {
		this.endDate = end;
	}
	
	public void start() {
		state.start(this);
	}
	
	public void togglePause() {
		state.togglePause(this);
	}
	
	public void finish() {
		state.finish(this);
	}
	
	public Duration workedTime() {
		return state.workedTime(startDate, endDate);
	}
	
	public void addComent(String comment) {
		if (state.addComent())
			comments.add(comment);
	}
	

}
