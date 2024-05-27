package ar.edu.unlp.info.oo2.biblioteca;

import java.time.Duration;
import java.time.LocalDateTime;

public class Finished implements ToDoItemState{

	@Override
	public void start(ToDoItem context) {
		//No hace nada.		
	}

	@Override
	public void togglePause(ToDoItem context) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");		
	}

	@Override
	public void finish(ToDoItem context) {
		//No hace nada.		
	}

	@Override
	public Duration workedTime(LocalDateTime startTime, LocalDateTime endTime) {
		return Duration.between(startTime, endTime);
	}

	@Override
	public boolean addComent() {
		return true;
	}


}
