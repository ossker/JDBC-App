package com.project.datasource;
import java.sql.Connection;
import java.sql.SQLException;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
public class DataSource {
private static HikariConfig config = new HikariConfig();
private static HikariDataSource ds;
static {
config.setJdbcUrl("jdbc:hsqldb:file:db/projekty"); //Zwr�� uwag�, �e teraz �cie�ka
config.setUsername("admin"); //wzgl�dna jest definiowana od
config.setPassword("admin"); //g��wnego katalogu projektu!
config.setMaximumPoolSize(1);//Wystarczy tylko jedno buforowane po��czenie
//config.addDataSourceProperty("cachePrepStmts", "true");
//config.addDataSourceProperty("prepStmtCacheSize", "250");
//config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
ds = new HikariDataSource(config);
}
private DataSource() {}
/** Domy�lna metoda tworz�ca/pobieraj�ca po��czenia
* @return
*/
 public static Connection getConnection() throws SQLException {
return ds.getConnection();
}
}
