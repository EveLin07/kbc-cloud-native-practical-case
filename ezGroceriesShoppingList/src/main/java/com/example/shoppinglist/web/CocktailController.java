package com.example.shoppinglist.web;

import com.example.shoppinglist.data.CocktailDataProvider;
import com.example.shoppinglist.model.Cocktail;
import com.example.shoppinglist.model.CocktailDBResponse;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class CocktailController {


    private final CocktailDBClient cocktailDBClient;

    @GetMapping("/cocktails")
    @ResponseStatus(HttpStatus.OK)
    public CocktailDBResponse getCocktails(@RequestParam(value = "search", required = false) String search) {

        var result = cocktailDBClient.searchCocktails(search);
        return result;
    }

}
