package com.springgameapi.services.Impl;

import com.springgameapi.models.Domain.GameModel;
import com.springgameapi.models.Entity.GameEntity;
import com.springgameapi.repositories.GameRepository;
import com.springgameapi.services.Face.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @Override
    public GameModel getGameById(long id) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        return mapEntityToDomain(gameEntity);
    }

    @Override
    public GameModel getGameByName(String name) {
        return null;
    }

    @Override
    public void updateGame(GameModel gameModel) {

    }

    @Override
    public long addGame(GameModel gameModel){
        GameEntity gameEntity = mapDomainToEntity(gameModel);
        GameEntity savedGame = gameRepository.save(gameEntity);
        return savedGame.getId();
    }

    /*
    * This method could be replace with a 3rd party mapping tool, but in my opinion those make your code
    * less legible and generally cause more bugs then they are worth
    * */
    GameModel mapEntityToDomain(GameEntity gameEntity){
        GameModel gameModel = new GameModel();
        gameModel.setName(gameEntity.getName());
        gameModel.setId(gameEntity.getId());
        gameModel.setGenre(gameEntity.getGenre());
        gameModel.setPrice(gameEntity.getPrice());

        return gameModel;
    }

    GameEntity mapDomainToEntity(GameModel gameModel){
        GameEntity gameEntity = new GameEntity();
        gameEntity.setId(gameModel.getId());
        gameEntity.setName(gameModel.getName());
        gameEntity.setGenre(gameModel.getGenre());
        gameEntity.setPrice(gameModel.getPrice());

        return gameEntity;
    }
}
