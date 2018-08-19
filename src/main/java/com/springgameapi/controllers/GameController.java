package com.springgameapi.controllers;

import com.springgameapi.models.Domain.GameModel;
import com.springgameapi.services.Face.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {
    private GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @RequestMapping(value = "/getGame/{id}", method = RequestMethod.GET)
    public GameModel getGameById(@PathVariable("id") Long id){
        GameModel testGameModel = gameService.getGameById(id);
        return testGameModel;
    }

    @RequestMapping(value = "/addGame", method = RequestMethod.PUT)
    public long addGame(@RequestBody GameModel gameModel){
        return gameService.addGame(gameModel);
    }
}
