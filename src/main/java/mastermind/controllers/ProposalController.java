package mastermind.controllers;

import java.util.List;

import mastermind.models.Combination;
import mastermind.models.Session;
import mastermind.types.Color;
import mastermind.types.Error;
import mastermind.views.ErrorView;
import mastermind.views.console.AttemptView;
import mastermind.views.console.LooserView;
import mastermind.views.console.ProposedCombinationView;
import mastermind.views.console.SecretCombinationView;
import mastermind.views.console.WinnerView;

public class ProposalController extends Controller {

	private SecretCombinationView secretCombinationView;
	private AttemptView attempsView;

	public ProposalController(Session session) {
		super(session);
		secretCombinationView = new SecretCombinationView(session.getSecretCombination());
		attempsView = new AttemptView();

	}

	@Override
	public void control() {

		secretCombinationView.writeSecretCombination();

		readProposedCombination();

		for (int i = 0; i < session.getAttempts(); i++) {
			attempsView.write(session.getProposedCombination(i), session.getResult(i));
		}

		checkIfWinnerOrLooser();

	}

	private void checkIfWinnerOrLooser() {
		if (session.isWinner()) {
			new WinnerView().write();
			session.nextState();
		}

		if (session.isLooser()) {
			new LooserView().write();
			session.nextState();
		}
	}

	private void readProposedCombination() {
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView();
		Error error;
		do {
			List<Color> colors = proposedCombinationView.read();
			error = addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).write();
			}
		} while (error != null);
	}

	private Error addProposedCombination(List<Color> colors) {
		Error error = null;
		if (colors.size() != Combination.WIDTH) {
			error = Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < colors.size(); i++) {
				if (colors.get(i) == null) {
					error = Error.WRONG_CHARACTERS;
				} else {
					for (int j = i + 1; j < colors.size(); j++) {
						if (colors.get(i) == colors.get(j)) {
							error = Error.DUPLICATED;
						}
					}
				}
			}
		}
		if (error == null) {
			this.session.addProposedCombination(colors);
		}
		return error;
	}

}
