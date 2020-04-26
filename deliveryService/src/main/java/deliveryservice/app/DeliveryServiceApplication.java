package deliveryservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages={"deliveryservice.app.*"})
@EnableJpaRepositories(basePackages= {"deliveryservice.app.repository","deliveryservice.app.model"})
@EntityScan(basePackages = "deliveryservice.app.model")
@EnableAutoConfiguration
public class DeliveryServiceApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(DeliveryServiceApplication.class,args);
    }
}
