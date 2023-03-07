·       User should be logged out from the application after clicking the logout button.

Controller Class:

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {
    
    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}

Service Class:

import org.springframework.stereotype.Service;

@Service
public class LogoutService {

    public void logout() {
        // logout logic
    }
}

Repository Class:

import org.springframework.stereotype.Repository;

@Repository
public class LogoutRepository {

    public void logout() {
        // logout logic
    }
}