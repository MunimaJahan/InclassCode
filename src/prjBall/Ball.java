package prjBall;

public class Ball {
private int size;
private String color;

public Ball() {
	size=0;
	color="";
}
public Ball(Ball b) {
	size=b.getSize();
	color=b.getColor();
}

public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
}