package Server;

class ServerMain {

	private int port;
	private server server;

	public ServerMain(int port) {
		this.port = port;
		server = new server(port);
	}

	public static void main(String[] args) {
		int port;
		if (args.length != 1) {
			System.out.println("Usage: java -jar ChernoChatServer.jar [port]");
			return;
		}
		port = Integer.parseInt(args[0]);
		new ServerMain(port);
	}

}
