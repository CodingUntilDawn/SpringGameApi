package Services.Face;

import Models.Domain.GameModel;
import org.springframework.stereotype.Component;

@Component
public interface GameService {
    GameModel getGameById();

    GameModel getGameByName();

    void updateGame();

    int addGame();
}
