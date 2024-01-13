package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtility {

	public static final int TIMEOUT = 30;

	private static final String CONNECTION = "jdbc:sqlite:movie.db";
	private static final String DRIVER_NAME = "org.sqlite.JDBC";



}
