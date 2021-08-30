package SingletonClass;

//Lazy Initialization(for MultiThreaded Applications,Double Check Locking)
public class SingletonClassDemo4 {
	    
	    // Static and volatile attribute.
		private static volatile SingletonClassDemo4 instance = null;

		// Private constructor.
		private SingletonClassDemo4() {

		}

		// public Static function, globally accessible
		public static SingletonClassDemo4 getInstance() {
			
			// Double check locking principle.
			// If there is no instance available, create new one 
			if (instance == null) {

				// To provide thread-safe implementation.
				synchronized(SingletonClassDemo4.class) {

					// Check again as multiple threads can reach above step.
					if (instance == null) {
						instance = new SingletonClassDemo4();
					}
				}
			}
			return instance;
		}
}
//lazy initialization - If there is no instance available, create new one 
//Thread safe, if two threads concurrently accessing the getInstance() Method before initialization both reach to first if Block
//one of the thread will be blocked(synchronized) until and another thread goes inside and instance is created.
//only once thread the thread s kept waited here there  after any number of threads accessing the method will get instance created by first thread itself