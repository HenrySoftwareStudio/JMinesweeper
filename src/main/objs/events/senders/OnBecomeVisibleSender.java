package main.objs.events.senders;

import java.util.ArrayList;

import main.objs.events.subscribers.OnBecomeVisible;

public class OnBecomeVisibleSender {
	protected static ArrayList<OnBecomeVisible> onBecomeVisibles = new ArrayList<>(1);
	
	public static void addSub(OnBecomeVisible e) {
		onBecomeVisibles.add(e);
	}
	
	public static void onEvent() {
		for (OnBecomeVisible onBecomeVisible : onBecomeVisibles) {
			onBecomeVisible.onOBVEvent();
		}
	}
}
