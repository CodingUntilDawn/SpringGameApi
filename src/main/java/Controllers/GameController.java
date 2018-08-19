package Controllers;

import Models.Game;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Game getGame(){
        Game testGame = new Game();
        testGame.setName("test");
        return testGame;
    }
}
