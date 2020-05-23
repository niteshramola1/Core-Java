import java.applet.Applet;
import java.awt.Graphics;

public class FirstApplet extends Applet {
	String str="";
public FirstApplet() {
	str="cer called";
	System.out.println("cer called");
}
public void init() {
	str=str+"init fired";
	System.out.println(str);
}
public void stop() {
	str=str+"stop fired";
	System.out.println(str);
}
public void start() {
	str=str+"start fired";
	System.out.println(str);
}
public void destroy() {
	str=str+"destroy fired";
	System.out.println(str);
}
public void paint(Graphics grp) {
	grp.drawString(str, 30, 100);
}

}