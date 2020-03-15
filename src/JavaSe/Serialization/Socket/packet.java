package JavaSe.Serialization.Socket;

import java.io.Serializable;

public class packet implements Serializable{
  String message;

public packet(String message) {
	super();
	this.message = message;
}
  
}
