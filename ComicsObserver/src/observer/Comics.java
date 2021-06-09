package observer;

import java.util.ArrayList;
import java.util.List;

public class Comics implements Observable {
	
	private List<Observer> subscribers;
	private String comics;
	public Comics() {
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.subscribers.add(observer);
		observer.setComics(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.subscribers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.subscribers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.comics;
	}

	public void setComics(String comics) {
		this.comics = comics;
		this.notifyObservers();
	}

}
