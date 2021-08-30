package SingletonClass;

//Lazy Initialization(for MultiThreaded Applications)
public class SingletonClassDemo3 {
	    
	    // Static attribute.
		private static SingletonClassDemo3 instance = null;

		// Private constructor.
		private SingletonClassDemo3() {

		}

		// public Static function, globally accessible
		// Only one thread can execute this at a time.
		public static synchronized SingletonClassDemo3 getInstance() {
			
			// If there is no instance available, create new one
			if (instance == null) {
				instance = new SingletonClassDemo3();
			}
			return instance;
		}
}
//lazy initialization - If there is no instance available, create new one 
//Thread safe, if two threads concurrently accessing the getInstance() Method,
//one of the thread will be blocked(Synchronized) until another thread completed its works inside 
//Every time thread has to wait if they are concurrently accessing the method.