package SingletonClass;

//Early Loading
public class SingletonClassDemo1 {
	
	    // Static attribute.
		// Making the "instance" attribute as "final" ensures that only one instance of the class exists.
		private static final SingletonClassDemo1 instance = new SingletonClassDemo1();

		// Private constructor.
		private SingletonClassDemo1() {

		}

		// public Static function , globally accessible
		public static SingletonClassDemo1 getInstance() {
			return instance;
		}
}

// Thread-Safe but always available even when Not needed
//(This instance is created as soon as application loads and instantiation happens)
