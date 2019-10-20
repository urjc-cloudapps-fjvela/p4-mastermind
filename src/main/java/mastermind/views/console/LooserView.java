package mastermind.views.console;

import mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

public class LooserView extends WithConsoleView {

	public LooserView() {
	}

	public void write() {
		this.console.writeln(MessageView.LOOSER.getMessage());

	}

}
