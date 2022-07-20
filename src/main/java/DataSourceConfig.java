import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
	
	@Bean
	public DataSource datasource() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		
		datasource.setUrl("");
		datasource.setUsername("");
		datasource.setPassword("");
		datasource.setDriverClassName("");
		
		
		return datasource();
	}

}
