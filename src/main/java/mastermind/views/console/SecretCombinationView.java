package mastermind.views.console;

import mastermind.models.SecretCombination;
import mastermind.views.MessageView;
import santaTecla.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {

	private SecretCombination secretCombination;

	public SecretCombinationView(SecretCombination secretCombination) {
		this.secretCombination = secretCombination;
	}

	public void writeSecretCombination() {
		console.writeln(
				new String(new char[secretCombination.getWidth()]).replace("\0", MessageView.SECRET.getMessage()));

	}

}
