package fr.crusche.test;

import com.quad.core.AbstractGame;
import com.quad.core.GameContainer;

public class GameManager {
    public static void main(String[] args) throws InterruptedException {
        GameContainer gc = new GameContainer(new AbstractGame());
        gc.setWidth(1920);
        gc.setHeight(1080);
        gc.setScale(1);
        gc.setTitle("Des chiffres et des lettres");
        gc.setClearScreen(true);
        gc.start();

        
        //gc.getGame().setState(gc, 1);
    }
}