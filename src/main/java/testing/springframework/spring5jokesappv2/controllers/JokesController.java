package testing.springframework.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import testing.springframework.spring5jokesappv2.services.JokeServiceImpl;

@Controller
public class JokesController {
    private final JokeServiceImpl jokeServiceImpl;

    public JokesController(JokeServiceImpl jokeServiceImpl) {
        this.jokeServiceImpl = jokeServiceImpl;
    }

    @RequestMapping("/")
    public String getBooks(Model model) {

        model.addAttribute("joke", jokeServiceImpl.getJoke());
        return "index";
    }
}
