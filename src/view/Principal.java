package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IAquivosController;

public class Principal {

	public static void main(String[] args) {
		
		IAquivosController arqCont = new ArquivosController();
		String dirWin = "C:\\Windows";
		String path = "C:\\TEMP\\Aula";
		String name = "teste";
		
		try {
			//arqCont.readDir(dirWin);
			//arqCont.createrFile(path, name);
			//arqCont.readFile(path, name);
			arqCont.openFile(path, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
