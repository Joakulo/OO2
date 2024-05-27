package ar.edu.unlp.info.oo2.biblioteca;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress implements ToDoItemState{

	@Override
	public void start(ToDoItem context) {
		//No hace nada.
	}

	@Override
	public void togglePause(ToDoItem context) {
		context.setState(new Paused());
	}

	@Override
	public void finish(ToDoItem context) {
		context.setState(new Finished());
		context.setEndDate(LocalDateTime.now());
	}

	@Override
	public Duration workedTime(LocalDateTime startTime, LocalDateTime endTime) {
		return Duration.between(startTime, LocalDateTime.now());
	}

	@Override
	public boolean addComent() {
		return true;
	}

}
