package com.springgameapi.services.impl;

import com.springgameapi.models.domain.GameModel;
import com.springgameapi.models.entity.GameEntity;
import com.springgameapi.repositories.GameRepository;
import com.springgameapi.services.face.GameService;
import com.springgameapi.services.shared.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private Mapper mapper;

    public GameServiceImpl(GameRepository gameRepository, Mapper mapper){
        this.gameRepository = gameRepository;
    }

    @Override
    public GameModel getGameById(long id) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        return mapper.mapEntityToDomain(gameEntity);
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
        GameEntity gameEntity = mapper.mapDomainToEntity(gameModel);
        GameEntity savedGame = gameRepository.save(gameEntity);
        return savedGame.getId();
    }
}
