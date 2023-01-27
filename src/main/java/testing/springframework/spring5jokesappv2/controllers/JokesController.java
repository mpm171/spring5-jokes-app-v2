package testing.springframework.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import testing.springframework.spring5jokesappv2.services.QuoteService;

@Controller
public class JokesController {
    private final QuoteService quoteService;

    public JokesController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String getBooks(Model model) {

        model.addAttribute("joke", quoteService.getQuote());
        return "index";
    }
}
