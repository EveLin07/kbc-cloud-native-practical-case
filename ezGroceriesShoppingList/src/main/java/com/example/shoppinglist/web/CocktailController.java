package com.example.shoppinglist.web;

import com.example.shoppinglist.data.CocktailDataProvider;
import com.example.shoppinglist.model.Cocktail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class CocktailController {

    @GetMapping("/cocktails")
    @ResponseStatus(HttpStatus.OK)
    public List<Cocktail> getCocktails(@RequestParam(value = "search", required = false) String search) {

        List<Cocktail> cocktails = CocktailDataProvider.getCocktails();
        log.info("Getting cocktails:...");
        return Objects.isNull(search)
                ? cocktails
                : cocktails.stream().filter(cocktail -> cocktail.getName().contains(search))
                .collect(Collectors.toList());
    }

}
