package Server;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class server implements Runnable {
	
	private List<ServerClient> clients = new ArrayList<ServerClient>();
	
	private DatagramSocket socket;
	private int port;
	private boolean running = false;
	private Thread run, manage, send, receive;
	
	public server(int port) {
		this.port = port;
		try {
			socket = new DatagramSocket(port);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		run = new Thread(this, "server");
		run.start();
	}
	
	public void run() {
		running = true;
		System.out.println("Server started on port " + port);
		manageClients();
		receive(); 
	}
	
	private void manageClients() {
		manage = new Thread("manage") {
			public void run() {
				while(running) {
					
				}
			}
		};
		manage.start();
	}
	
	private void receive() {
		receive = new Thread("receive") {
			public void run() {
				while(running) {
					byte[] data = new byte[1024];
					DatagramPacket packet = new DatagramPacket(data, data.length);
					try {
						socket.receive(packet);
					} catch (IOException e) {
						e.printStackTrace();
					}
					String string = new String(packet.getData());
					clients.add(new ServerClient("yan", packet.getAddress(), packet.getPort(), 50));
					System.out.println(clients.get(0).address.toString() + ":" + clients.get(0).port);
					System.out.println(string);
				}
			}
		};
		receive.start();
	}
}
