package com.example.WebFinalProject.controller;

import com.example.WebFinalProject.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.WebFinalProject.model.Contact;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @ModelAttribute("contact")
    public Contact contact() {
        return new Contact();
    }
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/aboutus")
    public String AboutUs() {
        return "AboutUs";
    }
    @GetMapping("/aupp")
    public String aupp() {
        return "aupp";
    }
    @GetMapping("/australianawards")
    public String australianawards() {
        return "australianawards";
    }
    @GetMapping("/aycc")
    public String AYCC() {
        return "aycc";
    }
    @GetMapping("/chevening")
    public String chevening() {
        return "chevening";
    }
    @GetMapping("/events")
    public String events() {
        return "events";
    }
    @GetMapping("/fulbright")
    public String fulbright() {
        return "fulbright";
    }
    @GetMapping("/ignite")
    public String ignite() {
        return "ignite";
    }
    @GetMapping("/kit")
    public String kit() {
        return "kit";
    }
    @GetMapping("/piu")
    public String piu() {
        return "piu";
    }
    @GetMapping("/puc")
    public String puc() {
        return "puc";
    }
    @GetMapping("/scholarships")
    public String scholarships() {
        return "scholarships";
    }
    @GetMapping("/ugrad")
    public String ugrad() {
        return "ugrad";
    }
    @GetMapping("/usinternship")
    public String usinternship() {
        return "usinternship";
    }
    @GetMapping("/yseali")
    public String yseali() {
        return "yseali";
    }
    @Autowired
    ContactRepo repo;
    @PostMapping("/addContact")
    public String addContact(@ModelAttribute Contact contact) {
        repo.save(contact);
        return "redirect:/"; // Redirect to home page after saving the contact
    }
}


