package com.mywebsite.spring_boot_website_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/redirect/facebook")
    public String redirectToFacebook() {
        // Redirect to Facebook's website
        return "redirect:https://www.facebook.com";
    }
    
    @GetMapping("/redirect/cdma")
    public String redirectToCDMA() {
        // Redirect to Commissioner and Director of Municipal Administration's website
        return "redirect:https://cdma.ap.gov.in";
    }
}
