package springgameapi.demo;

import Controllers.GameController;
import Repositories.GameRepository;
import Services.Face.GameService;
import Services.Implementation.GameServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = GameController.class)
@ComponentScan(basePackageClasses = {GameController.class, GameService.class, GameServiceImplementation.class, GameRepository.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
