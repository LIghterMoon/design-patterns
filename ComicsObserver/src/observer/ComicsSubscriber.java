package observer;


public class ComicsSubscriber implements Observer {

	private String name;
	private Observable subscribedTo;
	
	public ComicsSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
		if(this.subscribedTo == null) {
			System.out.println(this.getName() + "has no comics set");
			return;
		}
		
		String newComics = this.subscribedTo.getUpdate();
		System.out.println(this.getName() + "received an update:" + newComics);
	}

	@Override
	public void setComics(Observable comics) {
		this.subscribedTo = comics;
		
	}

	public String getName() {
		return name;
	}

}
