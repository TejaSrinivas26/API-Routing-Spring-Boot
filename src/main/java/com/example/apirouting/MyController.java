package com.example.apirouting;
  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String getHomePage() {
        return "Home Page";
    }

    @GetMapping("/about")
    public String getAboutPage() {
        return "About Page";
    }
}
