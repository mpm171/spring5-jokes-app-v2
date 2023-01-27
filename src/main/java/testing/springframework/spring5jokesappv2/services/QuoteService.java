package testing.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {
    public String getQuote() {
        ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();
        return cnq.getRandomQuote();
    }
}
