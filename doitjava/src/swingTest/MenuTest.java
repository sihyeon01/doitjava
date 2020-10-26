package swingTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

import com.sun.glass.events.KeyEvent;

import chapter13.Main;

public class MenuTest extends JFrame implements ActionListener, ItemListener {
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu menu, submenu;
	private JMenuItem menuItem1, menuItem2;
	private JMenuItem sbMenuItem1, sbMenuItem2;
	private JRadioButtonMenuItem rbMenuItem1, rbMenuItem2;
	private JCheckBoxMenuItem cbMenuItem1, cbMenuItem2;

	public MenuTest() {
		
		//�޴��ٸ� �����Ѵ�. 
		menuBar= new JMenuBar();
		
		//ù��° �޴��� ����
		menu= new JMenu("ù��° �޴�");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		
		//�޴� �׸���� ����
		menuItem1 = new JMenuItem("�޴� �׸� 1", KeyEvent.VK_1);
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.ALT_MASK));
		menuItem1.addActionListener(this);
		menu.add(menuItem1);
		
		ImageIcon icon = new ImageIcon("icon.gif");
		menuItem2 = new JMenuItem("�޴� �׸� 2", icon);
		menu.add(menuItem2);
		
		//���� ��ư �޴� �׸���� �����Ͽ� �޴��� �߰�
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		
		rbMenuItem1 = new JRadioButtonMenuItem("���� ��ư �޴� �׸� 1");
		rbMenuItem1.setSelected(true);
		group.add(rbMenuItem1);
		menu.add(rbMenuItem1);
		
		rbMenuItem2 = new JRadioButtonMenuItem("���� ��ư �޴� �׸�2");
		group.add(rbMenuItem2);
		menu.add(rbMenuItem2);
		
		//üũ �ڽ� �޴� �׸���� �����Ͽ� �޴��� �߰�
		
	menu.addSeparator();
	cbMenuItem1 = new JCheckBoxMenuItem("üũ �ڽ� �޴� �׸� 1");
	cbMenuItem1.addItemListener(this);
	menu.add(cbMenuItem1);
	
	cbMenuItem2 = new JCheckBoxMenuItem("üũ �ڽ� �޴� �׸�2");
	menu.add(cbMenuItem2);
	
	//���� �޴� ����
	menu.addSeparator();
	submenu = new JMenu("���� �޴�");
	submenu.setMnemonic(KeyEvent.VK_S);
	
	sbMenuItem1 = new JMenuItem("���� �޴� �׸� 1");
	sbMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
	submenu.add(sbMenuItem1);
	
	sbMenuItem2 = new JMenuItem("���� �޴� �׸�2");
	submenu.add(sbMenuItem2);
	menu.add(submenu);
	
	//�޴����� �ι��� ���� �ۼ��Ѵ�.
	menu = new JMenu("�ι�° �޴�");
	menu.setMnemonic(KeyEvent.VK_S);
	menuBar.add(menu);
	
	//�޴��ٸ� �����ӿ� �����Ѵ�.
	setJMenuBar(menuBar);
	setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuItem1) {
			JOptionPane.showMessageDialog(this, "�޴� �׸� 1�� ���õǾ����ϴ�.");
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()== cbMenuItem1) {
			JOptionPane.showMessageDialog(this,  "üũ �ڽ� �޴� �׸� 1�� ����Ǿ����ϴ�.");
			//üũ �ڽ� �޴� �׸� ���� ó��
		}
	}	
			
	public static void main(String[] args) {
		MenuTest f = new MenuTest();
		f.setSize(500, 200);
		f.setVisible(true);
	}
}