package edu.greenriver.sdev.httplab.controllers;

import edu.greenriver.sdev.httplab.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController
{
    @GetMapping("registration/add")
    public String viewForm(Model model)
    {
        model.addAttribute("reg", new Registration());
        return "site_reg";
    }

    @PostMapping("registration/add")
    public String postForm(Model model, @ModelAttribute Registration reg)
    {
        model.addAttribute("reg", reg);
        return "results";
    }
}
