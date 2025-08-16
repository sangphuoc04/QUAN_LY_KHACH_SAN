package sang.myproject.server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping("/")
    public String home() {
        return "home"; // Trả về home.html
    }

    @GetMapping("/login")
    public String login() {
        return "/login"; // This should return the name of the login view template
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard"; // Trả về dashboard.html
    }
}
