package app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("quartz-context.xml")
public class SchedulerConfig {

}
