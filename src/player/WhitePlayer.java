package player;

import java.io.IOException;
import java.net.UnknownHostException;

public class WhitePlayer {

	public static void main(String[] args) throws UnknownHostException, ClassNotFoundException, IOException {
		String[] array = new String[]{"-r", "WHITE", "-t",  "60",  "-h",  "localhost"};
		Player.main(array);
	}

}
