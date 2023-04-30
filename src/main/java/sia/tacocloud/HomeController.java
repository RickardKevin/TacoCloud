package sia.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Controller
public class HomeController {
   @GetMapping("/")
   public String home(){
      return "home";
   }
   @PostMapping
   public String getStarted(SessionStatus sessionStatus){      
       return"redirect:/design";
   }
}
