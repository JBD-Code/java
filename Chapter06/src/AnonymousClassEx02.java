import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHanlder implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("ActionEvent Occurred!");
		
	}
	
}

public class AnonymousClassEx02 {
	public static void main(String[]args){
		Button btn = new Button("Start");
		//btn.addActionListener(new EventHanlder());
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("ActionEvent Occurred!");
				
			}
		});
		
		
	}
}
