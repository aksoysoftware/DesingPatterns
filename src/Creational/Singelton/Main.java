package Creational.Singelton;

public class Main {
    public static void main(String[] args) {
        Database database;

        // Doğru kullanım:
        database = Database.getInstance();
        
       
         database.getConnection();
    }
}
