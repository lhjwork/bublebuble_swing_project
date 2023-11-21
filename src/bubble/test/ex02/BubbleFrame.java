package bubble.test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	
	private JLabel backgroundMap;
		
	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true);
	}
	
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
//		backgroundMap.setSize(100, 100);
//		backgroundMap.setLocation(300, 300);
		backgroundMap.setSize(1000, 600);
		add(backgroundMap); // JFrame에 JLabel이 그려진다.
	}
	
	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null); // 실행시 가운데로 뜨게 해줌
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 창을 끌 때 JVM 같이 종료하기
		
	}

	public static void main(String[] args) {
		new BubbleFrame();

	}
}
