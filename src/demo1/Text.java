package demo1;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Text extends JFrame {
	private Label lab=new Label("please input your name:");
	private TextField t=new TextField(10);
	private JButton butt=new JButton("È·¶¨");
	private TextArea te=new TextArea(1,20);
	private Panel p=new Panel();
	public Text() {
		this.setTitle("good morning!");
		this.setBounds(100,200,300,400);
		this.setVisible(true);
	}
	public void initialize() {
		p.add(lab);
		p.add(t);
		p.add(butt);
		p.add(te);
		this.add(p);
		butt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				te.setText(t.getText()+" "+"ÄãºÃ£¡");
				
			}
		});
		this.addWindowListener(new WindowAdapter() {
			@SuppressWarnings("unused")
			public void WidowsClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
public static void main(String[] args) {
	Text a=new Text();
	a.initialize();
}
}
