package mastermind;

import java.util.HashMap;
import java.util.Map;

import mastermind.controllers.Controller;
import mastermind.controllers.ProposalController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.models.Session;
import mastermind.models.StateValue;

public abstract class Mastermind {

	private Session session;


	private Map<StateValue, Controller> controllers;

	protected Mastermind() {
		session = new Session();
		controllers = new HashMap<StateValue, Controller>();
		controllers.put(StateValue.INITIAL, new StartController(session));
		controllers.put(StateValue.IN_GAME, new ProposalController(session));
		controllers.put(StateValue.FINAL, new ResumeController(session));
		controllers.put(StateValue.EXIT, null);


	}

	protected void play() {
		Controller controller;
		do {
			controller = controllers.get(session.getValueState());
			if (controller != null) {
				controller.control();
			}
		} while (controller != null);
	}
}
