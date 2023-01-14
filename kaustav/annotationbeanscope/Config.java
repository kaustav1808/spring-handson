package kaustav.annotationbeanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
 
@Configuration
@PropertySource("classpath:logger.properties")
public class Config {
 
	@Bean
	public MyLogger myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		MyLogger myLoggerConfig = new MyLogger(rootLoggerLevel, printedLoggerLevel);
 
		return myLoggerConfig;
	}
 
	// define bean for our sad fortune service
	@Bean
	public Test1 test1() {
		return new Test1();
	}
 
	// define bean for our swim coach AND inject dependency
	@Bean
	public Test2 test2() {
		return new Test2();
	}
	
	@Bean
	public Test2 annotedBean() {
		System.out.println("This bean is creating from @Bean annotation");
		return new Test2();
	}
 
}
