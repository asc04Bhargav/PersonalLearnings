package gateway_backendservice_gm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodMorningController {

    @GetMapping("/gm")
    public String goodMorning(){
        return "Good Morning";
    }
}
