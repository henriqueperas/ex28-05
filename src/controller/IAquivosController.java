package controller;

import java.io.IOException;

public interface IAquivosController {

	public void readDir(String path) throws IOException;
	public void createrFile(String path, String name) throws IOException;
	public void readFile(String path, String name) throws IOException;
	public void openFile(String path, String name) throws IOException;
	
}
