package dev.mouhieddine.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class QuoteGeneratorServiceImpl implements QuoteGeneratorService {

    final ChuckNorrisQuotes chuckNorrisQuotes;

    public QuoteGeneratorServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
