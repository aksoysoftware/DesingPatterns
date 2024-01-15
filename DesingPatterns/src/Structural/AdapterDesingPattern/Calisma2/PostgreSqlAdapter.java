package AdapterDesingPattern.Calisma2;

public class PostgreSqlAdapter implements DatabaseAdapter{

	PostgreSqlDataBaseDriver postgreSqlDataBaseDriver;
	
	
	public PostgreSqlAdapter(PostgreSqlDataBaseDriver postgreSqlDataBaseDriver) {
		super();
		this.postgreSqlDataBaseDriver = postgreSqlDataBaseDriver;
	}

	@Override
	public void establishConnection() {
		postgreSqlDataBaseDriver.connect();
		
	}

	@Override
	public void executeQuery(String query) {
		postgreSqlDataBaseDriver.query(query);
		
	}

}
