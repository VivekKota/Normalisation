package SingletonClass;

//lazy initialization(for Single Threaded Applications)
public class SingletonClassDemo2 {
	
	//static attribute
	private static SingletonClassDemo2 instance = null;

	// Private constructor.
	private SingletonClassDemo2() {

	}

	// public Static function, globally accessible
	public static SingletonClassDemo2 getInstance() {
		
		// If there is no instance available, create new one
		if (instance == null) {
			instance = new SingletonClassDemo2();
		}
		return instance;
	}

}

//lazy initialization - If there is no instance available, create new one 
//Not thread safe, if two threads concurrently accessing the getInstance() Method and initially if instance was not initialized 
// so both of the threads will see instance was not initialized, both will initialize a new instance, not a thread safe. 
