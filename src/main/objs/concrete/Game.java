package main.objs.concrete;

import main.env.DefaultValues;
import main.ui.frame.GameFrame;

public final class Game {

	public Game() {
		new GameFrame(DefaultValues.NameENG);
	}
}
