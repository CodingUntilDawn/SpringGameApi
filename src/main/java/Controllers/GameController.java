package Controllers;

import Models.Domain.GameModel;
import Repositories.GameRepository;
import Services.Face.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {
    /*@Autowired
    private GameRepository gameRepository;
    */

    private GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public GameModel getGame(){
        GameModel testGameModel = new GameModel();
        testGameModel.setName("test");
        return testGameModel;
    }

    @RequestMapping(value = "/addGame", method = RequestMethod.PUT)
    public long addGame(){
        //long gameId =
        return 0;
    }
}
