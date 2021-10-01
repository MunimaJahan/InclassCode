package prjBall;

public class BallApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball b =new Ball();
		b.setColor("Blue");
		b.setSize(5);
		Ball b2=new Ball(b);
		printBall(b2);
		String newc="Red";
		int news=10;
		changeColor(b, newc, news);
		printBall(b);
		changeColor(newc, news);
		System.out.println(newc+" "+news);
	}
	public static void printBall(Ball ball) {
		System.out.println(ball.getColor());
		System.out.println(ball.getSize());
	}
	public static void changeColor(Ball b, String c, int s) {
		b.setColor(c);
		b.setSize(s);
	}
	public static void changeColor( String c, int s) {
		c="Green";
		s=20;
	}

}
