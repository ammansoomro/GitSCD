public class Task04 {

	public static void main(String[] args) {
		ConnectedState CS = new ConnectedState();
		DisconnectedState DS = new DisconnectedState();
		PushBackConnectedState PCS = new PushBackConnectedState();
		PushBackDisconnectedState PDS = new PushBackDisconnectedState();	
		PushBackConnection PBC = new PushBackConnection();
		
		CS.connect();
		CS.send(16);
		System.out.println("Received " + CS.receive() + " bits of Data.");
		CS.disconnect();
		
		DS.connect();
		DS.send(19);
		System.out.println("Received " + DS.receive() + " bits of Data.");
		DS.disconnect();
		
		PDS.connect();
		PDS.send(46);
		System.out.println("Received " + PDS.receive() + " bits of Data.");
		PDS.pushBack(34);
		System.out.println("Received " + PDS.receive() + " bits of more Data.");
		PDS.disconnect();
		
		PCS.connect();
		PCS.send(83);
		System.out.println("Received " + PCS.receive() + " bits of Data.");
		PCS.pushBack(27);
		System.out.println("Received " + PCS.receive() + " bits of more Data.");
		PCS.disconnect();
		
		PBC.connect();
		PBC.send(63);
		System.out.println("Received " + PBC.receive() + " bits of Data.");
		PBC.pushBack(20);
		System.out.println("Received " + PBC.receive() + " bits of more Data.");
		PBC.disconnect();
		
	}

}

interface connections{
	public void connect();
	public void disconnect();
	public void send(int data);
	public int receive();
	
}
interface pushback extends connections{
	public void pushBack(int value);
}

class ConnectedState{
	
	private int Data;
	
	public void connect() {
		System.out.println("=============== Connected Stated ===============");
		System.out.println("Connection Established.");
	}
	public void disconnect() {
		System.out.println("Connection Disconnected.");
	}
	public void send(int data) {
		Data = data;
		System.out.println("Sending " + Data + " bits of Data.");
	}
	public int receive() {
		return Data;
	}
}

class DisconnectedState{
	
	private int Data;
	
	public void connect() {
		System.out.println("=============== Disconnected Stated ===============");
		System.out.println("Connection Established.");
	}
	public void disconnect() {
		System.out.println("Connection Disconnected.");
	}
	public void send(int data) {
		Data = data;
		System.out.println("Sending " + Data + " bits of Data.");
	}
	public int receive() {
		return Data;
	}
}

class PushBackConnectedState extends ConnectedState implements pushback{
	
	private int Data;
	
	public void pushBack(int value) {
		Data = value;
		System.out.println("Pushing back " + Data + " bits of Data.");
	}
	public void connect() {
		System.out.println("=============== PushBack Connected State ===============");
		System.out.println("Connection Established.");
	}
	public void disconnect() {
		System.out.println("Connection Disconnected.");
	}
	public void send(int data) {
		Data = data;
		System.out.println("Sending " + Data + " bits of Data.");
	}
	public int receive() {
		return Data;
	}
}

class PushBackConnection implements pushback{
	
	private int Data;
	
	public void pushBack(int value) {
		Data = value;
		System.out.println("Pushing back " + Data + " bits of Data.");
	}
	public void connect() {
		System.out.println("=============== PushBack Connection ===============");
		System.out.println("Connection Established.");
	}
	public void disconnect() {
		System.out.println("Connection Disconnected.");
	}
	public void send(int data) {
		Data = data;
		System.out.println("Sending " + Data + " bits of Data.");
	}
	public int receive() {
		return Data;
	}
}

class PushBackDisconnectedState extends DisconnectedState implements pushback{
	
	private int Data;
	
	public void pushBack(int value) {
		Data = value;
		System.out.println("Pushing back " + Data + " bits of Data.");
	}
	public void connect() {
		System.out.println("=============== PushBack Disconnected State ===============");
		System.out.println("Connection Established.");
	}
	public void disconnect() {
		System.out.println("Connection Disconnected.");
	}
	public void send(int data) {
		Data = data;
		System.out.println("Sending " + Data + " bits of Data.");
	}
	public int receive() {
		return Data;
	}
}
