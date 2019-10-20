package mastermind.views.console;

import mastermind.models.Result;
import mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

class ResultView extends WithConsoleView {

	ResultView() {
	}

	void writeln(Result result) {
		this.console.writeln(MessageView.RESULT.getMessage().replaceFirst("#blacks", "" + result.getBlacks())
				.replaceFirst("#whites", "" + result.getWhites()));
	}

}
