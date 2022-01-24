package main.objs.events.senders;

import java.util.ArrayList;

import main.objs.events.subscribers.OnGameStart;

public class OnGameStartSender {
	protected static ArrayList<OnGameStart> onGameStarts = new ArrayList<>(1);
	
	public static void addSub(OnGameStart onGameStart) {
		onGameStarts.add(onGameStart);
	}
	
	public static void onEvent() {
		for (OnGameStart onGameStart : onGameStarts) {
			onGameStart.OnOGSEvent();
		}
	}
}
