package com.springgameapi.services.shared;

import com.springgameapi.models.domain.GameModel;
import com.springgameapi.models.entity.GameEntity;
import org.springframework.stereotype.Service;

@Service
public class Mapper {

    /*
     * This method could be replace with a 3rd party mapping tool, but in my opinion those make your code
     * less legible and generally cause more bugs then they are worth
     * */
    public GameModel mapEntityToDomain(GameEntity gameEntity){
        GameModel gameModel = new GameModel();
        gameModel.setName(gameEntity.getName());
        gameModel.setId(gameEntity.getId());
        gameModel.setGenre(gameEntity.getGenre());
        gameModel.setPrice(gameEntity.getPrice());

        return gameModel;
    }

    public GameEntity mapDomainToEntity(GameModel gameModel){
        GameEntity gameEntity = new GameEntity();
        gameEntity.setId(gameModel.getId());
        gameEntity.setName(gameModel.getName());
        gameEntity.setGenre(gameModel.getGenre());
        gameEntity.setPrice(gameModel.getPrice());

        return gameEntity;
    }
}
