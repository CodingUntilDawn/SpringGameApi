package com.springgameapi.services.face;

import com.springgameapi.models.domain.GameModel;
import org.springframework.stereotype.Component;

@Component
public interface GameService {
    GameModel getGameById(long id);

    GameModel getGameByName(String name);

    void updateGame(GameModel gameModel);

    long addGame(GameModel gameModel);
}
