package AdapterDesingPattern.Calisma2;

public class DataBaseFactory {

	 public static DatabaseAdapter createDatabaseAdapter(String databaseType) {
	        if ("MySQL".equalsIgnoreCase(databaseType)) 
	        {
	            return new MySqlAdapter(new MySqlDataBaseDriver());
	        } else if ("PostgreSQL".equalsIgnoreCase(databaseType)) {
	            return new PostgreSqlAdapter(new PostgreSqlDataBaseDriver());
	        } else {
	            throw new IllegalArgumentException("Geçersiz veritabanı tipi: " + databaseType);
	        }
	    }
	}
