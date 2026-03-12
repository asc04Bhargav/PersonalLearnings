package gateway_backendservice_hpbs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HappyBirthdayController {

    @GetMapping("/hbd")
    public String happyBirthday(){
        return "Happy Birthday";
    }
}
