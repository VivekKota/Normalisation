package SingletonClass;

import java.sql.Connection;

public class JDBCSingleton {

	private static volatile JDBCSingleton instance = null;

	private JDBCSingleton() {

	}

	public static JDBCSingleton getInstance() {

		if (instance == null) {

			synchronized (JDBCSingleton.class) {

				if (instance == null) {
					instance = new JDBCSingleton();
				}
			}
		}
		return instance;
	}

	// to get the connection from methods like insert, view etc.
	public static Connection getConnection() {

		return null;

	}

	// to insert the record into the database
	public int insert() {

		return 0;

	}

	// to view the data from the database
	public void view() {
	}

	// to update the data in database
	public int update() {

		return 0;
	}

	// to delete the data from the database
	public int delete() {

		return 0;

	}

}
