package httprequests.controller;

import httprequests.dtos.WordDefinition;
import httprequests.services.DictionaryService;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Optional;

/**
 * RESTful controller to access word/definition records.
 * @author Aaron Neagle
 * @version 1.0
 */
@RestController
@RequestMapping("dict") // returns all words in the dictionary
public class DictionaryApi {
    private DictionaryService service;

    /**
     * @param service constructor
     */
    public DictionaryApi(DictionaryService service){
        this.service = service;
    }

    /**
     * GET
     * Returns all words in the dictionary.
     * @return allwords
     */
    //http://localhost:8080/dict
    @GetMapping("")
    public java.util.List<String> allWords() {
        return service.allWords();
    }

    /**
     * GET
     * Returns the definition of the word provided as a path variable
     * @param word to find
     * @return definition of word
     */
    //http://localhost:8080/dict/{word}
    @GetMapping("{word}")
    public Optional<String> getDefinition(@PathVariable String word) {
        return service.getDefinition(word);
    }

    /**
     * POST
     * Adds a new word/definition pair given the path variables.
     * @param word to be added
     * @param definition of word
     */
    @PostMapping("path/{word}/{dictionary}")
    public void addWord(@RequestParam String word, @RequestParam String definition) {
        WordDefinition wordDefinition = new WordDefinition(word, definition);
        service.addWord(wordDefinition);
    }

    /**
     * POST
     * Adds a new word/definition pair using the query string parameters.
     * @param wordDefinition word and definition pair
     */
    @PostMapping("param?word=val1&definition=val2")
    public void addWord(WordDefinition wordDefinition){
        service.addWord(wordDefinition);
    }

    /**
     * POSt
     * 	Adds a new word/definition pair using the request body
     * @param wordDefinition pair to be added
     */
    @PostMapping("body{}")
    public void addWordPair(WordDefinition wordDefinition){
        service.addWord(wordDefinition);
    }


}
