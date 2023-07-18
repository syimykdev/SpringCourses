package Config.SPCN;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingProperties greetingProperties;

    public GreetingController(GreetingProperties greetingProperties){
        this.greetingProperties = greetingProperties;
    }

    @GetMapping
    public String home(){
        return greetingProperties.salutation() + ", Milano";
    }
}
