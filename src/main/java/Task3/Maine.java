package Task3;

import java.util.LinkedList;
import java.util.List;

public class Maine {
    public static void main(String[] args) {

        Board value1Board = new Board();
        Board value2Board = new Board();

        Game value1Game = Game.getGame();
        Game value2Game = Game.getGame();


        List<Board> valueBoard1 = new LinkedList<>();
        valueBoard1.add(value1Board);
        valueBoard1.add(value2Board);

        List<Game> valueGame = new LinkedList<>();
        valueGame.add(value1Game);
        valueGame.add(value2Game);


        System.out.println(valueBoard1);
        System.out.println(valueGame);

        System.out.println(Board.valueBoard);
        System.out.println(Game.valueGame);





    }
}
