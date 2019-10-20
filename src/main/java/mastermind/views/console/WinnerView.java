package mastermind.views.console;

import mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

public class WinnerView extends WithConsoleView {

	public WinnerView() {
	}

	public void write() {
		this.console.writeln(MessageView.WINNER.getMessage());

	}

}
