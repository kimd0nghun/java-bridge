package bridge;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현

        GameController gameController = new GameController(InputView.getInstance(), OutputView.getInstance());
        gameController.service();
    }

}
