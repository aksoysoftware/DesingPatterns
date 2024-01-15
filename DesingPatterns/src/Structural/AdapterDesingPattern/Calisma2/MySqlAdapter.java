package AdapterDesingPattern.Calisma2;

public class MySqlAdapter implements DatabaseAdapter{

	MySqlDataBaseDriver mySqlDataBaseDriver;
	

	public MySqlAdapter(MySqlDataBaseDriver mySqlDataBaseDriver) {
		super();
		this.mySqlDataBaseDriver = mySqlDataBaseDriver;
	}

	@Override
	public void establishConnection() {
		mySqlDataBaseDriver.connect();
		
	}

	@Override
	public void executeQuery(String query) {
		mySqlDataBaseDriver.query(query);
	}

}
