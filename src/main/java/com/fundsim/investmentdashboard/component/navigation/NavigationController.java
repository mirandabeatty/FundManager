package com.fundsim.investmentdashboard.component.navigation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @GetMapping("/")
    public String home() {
        return "component/navigation/home";
    }

    @GetMapping("/about")
    public String about() {
        return "component/navigation/about";
    }
}
