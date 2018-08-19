package Services.Implementation;

import Models.Domain.GameModel;
import Repositories.GameRepository;
import Services.Face.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GameServiceImplementation implements GameService {

    /*private GameRepository gameRepository;

    @Autowired
    public GameServiceImplementation(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }*/

    @Override
    public GameModel getGameById() {
        return null;
    }

    @Override
    public GameModel getGameByName() {
        return null;
    }

    @Override
    public void updateGame() {

    }

    @Override
    public int addGame(){
        return 0;
    }
}
