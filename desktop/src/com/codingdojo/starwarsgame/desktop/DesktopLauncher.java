package com.codingdojo.starwarsgame.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.codingdojo.starwarsgame.StarWarsGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "RedFive";
		config.width = 800;
		config.height = 480;
		config.resizable = false;
		config.addIcon("images/death_star_32.jpg", Files.FileType.Internal);
		config.addIcon("images/death_star_128.jpg", Files.FileType.Internal);
		new LwjglApplication(new StarWarsGame(), config);
	}
}
