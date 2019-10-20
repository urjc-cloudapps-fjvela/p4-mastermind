package mastermind.views.console;

import java.util.List;

import mastermind.models.Result;
import mastermind.types.Color;
import mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

public class AttemptView extends WithConsoleView {

	private ProposedCombinationView proposedCombinationView;
	private ResultView resultView;

	public AttemptView() {
		proposedCombinationView = new ProposedCombinationView();
		resultView = new ResultView();
	}

	public void write(List<Color> proprosedCombination, Result result) {
		proposedCombinationView.write(proprosedCombination);
		resultView.writeln(result);

	}

	void writeAttemps(int attemps) {
		console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts", "" + attemps));
	}

}
