package week1.day2;

public class mobile {
public void sendMessage() {
	System.out.println("sent Message");
}
public void shareDocument() {
	System.out.println("share Document");
	
}
public void call() {
	System.out.println("call");
}
public static void main(String[]args) {
	mobile actions = new mobile();
	actions.sendMessage();
	actions.shareDocument();
	actions.call();
	
	
}
}
