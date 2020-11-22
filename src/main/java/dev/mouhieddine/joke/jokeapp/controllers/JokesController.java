package dev.mouhieddine.joke.jokeapp.controllers;

import dev.mouhieddine.joke.jokeapp.services.QuoteGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final QuoteGeneratorService quoteGeneratorService;
    @Autowired
    public JokesController(QuoteGeneratorService quoteGeneratorService) {
        this.quoteGeneratorService = quoteGeneratorService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",quoteGeneratorService.getJoke());
        return "chucknorris";
    }
}
