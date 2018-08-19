package com.springgameapi.services.Face;

import com.springgameapi.models.Domain.GameModel;
import org.springframework.stereotype.Component;

@Component
public interface GameService {
    GameModel getGameById(long id);

    GameModel getGameByName(String name);

    void updateGame(GameModel gameModel);

    long addGame(GameModel gameModel);
}
