package org.assignment.datawarehouse.DAO;



import org.neo4j.driver.*;
import org.neo4j.driver.Record;

public class GDb {
    private static String url = "bolt://localhost:7687";
    private static String username = "neo4j";
    private static String password = "tjmoviedb";
    private static Driver driver;

    public GDb() throws Exception {
        try {
            driver = GDb.driver(url, AuthTokens.basic(username, password));
        } catch (Exception e) {
            throw new Exception("Graph database connection failed: ", e);
        }
    }

    public void closeConnection() throws Exception {
        try {
            if (driver != null) {
                driver.close();
            }
        } catch (Exception e) {
            throw new Exception("Graph database close failed: ", e);
        }
    }
}
