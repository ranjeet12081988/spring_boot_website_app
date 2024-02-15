package com.mywebsite.spring_boot_website_app;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // Returns the view name "index" for the root URL
        return "index";
    }

    @GetMapping("/redirect/facebook")
    public String redirectToFacebook() {
        // Redirects to Facebook's website
        return "redirect:https://www.facebook.com";
    }	
    
    @GetMapping("/redirect/cdma")
    public String redirectToCDMA() {
        // Redirects to Commissioner and Director of Municipal Administration's website
        return "redirect:https://cdma.ap.gov.in";
    }
    
    @GetMapping("/redirect/apspdcl")
    public String redirectToApspdcl() {
        // Redirects to Andhra Pradesh Southern Power Distribution Company's website
        return "redirect:https://www.apspdcl.in/";
    }
}
