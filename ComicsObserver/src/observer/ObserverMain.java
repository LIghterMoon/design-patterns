package observer;

public class ObserverMain {

	public static void main(String[] args) {
		
		Comics comics = new Comics();
		
		Observer obs1 = new ComicsSubscriber("Comics sybscriber 01");
		Observer obs2 = new ComicsSubscriber("Comics sybscriber 02");
		Observer obs3 = new ComicsSubscriber("Comics sybscriber 03");
		
		comics.subscribe(obs1);
		comics.subscribe(obs2);
		comics.subscribe(obs3);
		
		comics.setComics("New comics arive in Bulgaria 2021");
		
	}

}
