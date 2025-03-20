package main;
/*************************************************************************************************************************
 *
 *@author  Manamtam, Thyron G., Mendoza, Marc P.
 *@date_created 11/22/2024 21:51
 * CMSC 22 Object-Oriented Programming
 * CD3L
 *
 * We created a game with the GUI functioning and also analyzing
 * and creating a concept.
 *
 * (c) Institute of Computer Science, CAS, UPLB
 *
 *
 *************************************************************************************************************************/
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage)
    {
       Game game = new Game();
       game.setStage(stage);
    }
}