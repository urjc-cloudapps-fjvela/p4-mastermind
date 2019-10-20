package mastermind.models;

import java.util.List;

import mastermind.types.Color;

public class Session {

	private State state;

	private Game game;

	public Session() {
		this.state = new State();
		this.game = new Game();
	}

	public void nextState() {
		this.state.next();
	}

	public void addProposedCombination(List<Color> colors) {
		this.game.addProposedCombination(colors);
	}

	public void clearGame() {
		this.game.clear();
		this.state.reset();
	}

	public boolean isWinner() {
		return this.game.isWinner();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}

	public int getWidth() {
		return this.game.getWidth();
	}

	public int getAttempts() {
		return this.game.getAttempts();
	}

	public List<Color> getProposedCombination(int position) {
		return this.game.getProposedCombination(position);
	}

	public SecretCombination getSecretCombination() {
		return game.getSecretCombination();
	}

	public Result getResult(int position) {
		return game.getResult(position);
	}

	public StateValue getValueState() {
		return this.state.getValueState();
	}

}
