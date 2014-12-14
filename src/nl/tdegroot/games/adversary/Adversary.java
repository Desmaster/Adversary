package nl.tdegroot.games.adversary;

import nl.tdegroot.games.pixxel.PixxelGame;
import nl.tdegroot.games.pixxel.gfx.Screen;
import nl.tdegroot.games.pixxel.gfx.SpriteSheet;

public class Adversary extends PixxelGame {

    private SpriteSheet sheet;

    public Adversary(String title, int width, int height, int scale) {
        super(title, width, height, scale);
    }

    public void init() {
        sheet = new SpriteSheet("/sprites/sheet.png", 16, 16);
    }

    public void tick(int delta) {

    }

    public void render() {
        Screen screen = window.screen;
        screen.render(10, 10, sheet.sprites[1]);
    }

    public static void main(String[] args) {
        Adversary game = new Adversary("Adversary", 1280, 720, 4);
        game.start();
    }
}
