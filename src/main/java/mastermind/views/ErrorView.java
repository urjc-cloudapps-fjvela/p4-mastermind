package mastermind.views;

import mastermind.types.Error;
import santaTecla.utils.WithConsoleView;

public class ErrorView extends WithConsoleView {

	public static final String[] MESSAGES = { 
			"Repeated colors",
			"Wrong colors, they must be: " + ColorView.allInitials(), 
			"Wrong proposed combination length" };

	protected Error error;

	public ErrorView(Error error) {
		this.error = error;
	}
	
	private String getMessage() {
		return ErrorView.MESSAGES[this.error.ordinal()];
	}
	
	public void write() {
		console.writeln(getMessage());
	}
}
