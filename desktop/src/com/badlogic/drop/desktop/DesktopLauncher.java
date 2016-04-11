package com.badlogic.drop.desktop;

import com.badlogic.drop.Drop;
import com.badlogic.drop.GameScreen;
import com.badlogic.drop.MainMenuScreen;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		System.setProperty("user.name","M0N3");//Костыль против ошибки связаной с именем пользователя не на инглише
		config.title = "GameScreen";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new Drop(),config);
	}
}
