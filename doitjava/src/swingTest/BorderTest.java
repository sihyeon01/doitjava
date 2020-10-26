package swingTest;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Myframe2 extends JFrame{
	public Myframe2(){
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임은 디폴트로 BorderLayout 이므로 사실은 불필요
		setLayout(new BorderLayout());
		
		//버튼을 추가한다.
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("East"), BorderLayout.EAST);
		pack();
		setVisible(true);
		}
}

public class BorderTest {
	public static void main(String[] args) {
		Myframe2 f = new Myframe2();
	}
}
