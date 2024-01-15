package AdapterDesingPattern.Calisma2;

public class App {

		public static void main(String[] args) {
			DatabaseAdapter mysqlAdapter = DataBaseFactory.createDatabaseAdapter("MySQL");
	        mysqlAdapter.establishConnection();
	        mysqlAdapter.executeQuery("SELECT * FROM table");

	        
	        DatabaseAdapter postgresqlAdapter = DataBaseFactory.createDatabaseAdapter("PostgreSQL");
	        postgresqlAdapter.establishConnection();
	        postgresqlAdapter.executeQuery("SELECT * FROM table");
		}
	
}
