package Task3;

public class Game {

    //Musze gdzieś ten obiekt przetrzymywac
    private static Game game;

    public static int valueGame;


    private Game() {
        valueGame++;
    }

    public static Game getGame() {
        if(game == null) {
            game = new Game();
        }
        return game;
    }
}
