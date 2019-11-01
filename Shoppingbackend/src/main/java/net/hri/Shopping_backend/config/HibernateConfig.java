package net.hri.Shopping_backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages= {"net.hri.Shopping_backend.dto"})
@EnableTransactionManagement
@Configuration
public class HibernateConfig {
   private final static String DATABASE_URL=""; 
   private final static String DATABASE_DRIVER="org.h2.Driver";
   private final static String DATABASE_DIALECT="";
   private final static String DATABASE_USERNAME="sa";
   private final static String DATABASE_PASSWORD="123456";
   
   //datasource will be available
   @Bean 
   public DataSource getDataSource() {
	
	// providing the base connection information
	   
	   BasicDataSource dataSource = new BasicDataSource();
       dataSource.setDriverClassName(DATABASE_DRIVER); 
       dataSource.setUrl(DATABASE_URL);
       dataSource.setUsername(DATABASE_USERNAME);
       dataSource.setPassword(DATABASE_PASSWORD);
	   
	   return dataSource;
        		  
   
   }
	
   
   //sessionFactory bean willbe available 
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
	 builder.scanPackages("net.hri.Shopping_backend.dto");	
		
		return builder.buildSessionFactory();
	}

@Bean
public Properties getHibernateProperties() {
	Properties properties = new Properties();
	properties.put("hibernate.dialect", DATABASE_DIALECT);
	properties.put("hibernate.show_sql", "true");
	properties.put("hibernate.format_sql", "true");
	
	return properties;
}
   
//transaction manager bean
@Bean
 public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	return transactionManager;
}
   
   
   
   
   
   
}
