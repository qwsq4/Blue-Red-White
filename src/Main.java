import model.EndGameGheck;
import model.InterfaceComponents;

import java.util.Timer;

public class Main {

    static InterfaceComponents components;
    static EndGameGheck endGameGheck;

    public static void main(String[] args) {
        components = new InterfaceComponents();
        endGameGheck = new EndGameGheck(components);
        components.initializate();
        endGameGheck.run();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(endGameGheck, 0, 1*1000);
    }
}