package ar.edu.unlp.info.oo2.biblioteca;

import java.time.Duration;
import java.time.LocalDateTime;

public interface ToDoItemState {

	public void start(ToDoItem context);
	
	public void togglePause(ToDoItem context);
	
	public void finish(ToDoItem context);
	
	public Duration workedTime(LocalDateTime startTime, LocalDateTime endTime);
	
	public boolean addComent();	
	
}
