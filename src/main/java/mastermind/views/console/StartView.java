package mastermind.views.console;

import mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

public class StartView extends WithConsoleView {

	public StartView() {
	}

	public void writeTitle() {
		this.console.writeln(MessageView.TITLE.getMessage());

	}

}
