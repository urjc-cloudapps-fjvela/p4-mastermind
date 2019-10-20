package mastermind.views.console;

import mastermind.views.MessageView;
import santaTecla.utils.YesNoDialog;

public class ResumeView {
	

	public ResumeView() {
	}

	public boolean askNewGame() {
		return new YesNoDialog().read(MessageView.RESUME.getMessage());
	}

}
