import java.awt.Graphics;
import java.awt.Rectangle;

public interface MovingObject {
	void move();
	Rectangle getBoundingRect();
	void draw(Graphics g);
}