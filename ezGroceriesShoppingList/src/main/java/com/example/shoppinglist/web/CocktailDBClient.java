package com.example.shoppinglist.web;

import com.example.shoppinglist.config.FeignClientConfig;
import com.example.shoppinglist.model.CocktailDBResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
    @FeignClient(name = "cocktailDBClient", url = "https://www.thecocktaildb.com/api/json/v1/1", configuration = FeignClientConfig.class)
    public interface CocktailDBClient {

        @GetMapping(value = "search.php")
        CocktailDBResponse searchCocktails(@RequestParam("s") String search);
}
