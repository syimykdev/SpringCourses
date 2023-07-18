package Config.SPCN;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;


@ConfigurationProperties("greeting")

public record GreetingProperties (@DefaultValue("whats up!") String salutation){
}
