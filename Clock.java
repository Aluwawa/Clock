import java.awt.*;
import java.text.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import javax.swing.*;

public class Clock {{
	
	Font myFont = new Font("SANS_SERIF",Font.BOLD,40);
	
	JFrame frame = new JFrame("Clock");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Clock");
	frame.setLayout(null);
	frame.setSize(350,200);
	frame.setResizable(false);
	
	SimpleDateFormat timeF = new SimpleDateFormat("hh:mm");
	SimpleDateFormat dayF = new SimpleDateFormat("EEEE");
	SimpleDateFormat dateF = new SimpleDateFormat("MMMMM dd, yyyy");
	
	JLabel timeLabel = new JLabel();
	timeLabel.setFont(myFont);
	timeLabel.setForeground(Color.GRAY);
	timeLabel.setBackground(Color.black);
	timeLabel.setOpaque(true);
	  
	JLabel dayLabel = new JLabel();
	dayLabel.setFont(myFont);
	  
	JLabel dateLabel = new JLabel();
	dateLabel.setFont(myFont);
	
	frame.add(timeLabel);
	frame.add(dayLabel);
	frame.add(dateLabel);
	frame.setVisible(true);
	  
	setTime();
	}
    public static void main(String[] args){
      while(true) {
   
		time = timeF.format(Calendar.getInstance().getTime());
          JLabel timeLabel;
		timeLabel.setText(time);
        	  
          day = dayF.format(Calendar.getInstance().getTime());
          dayLabel.setText(day);
        	  
          date = dateF.format(Calendar.getInstance().getTime());
          dateLabel.setText(date);
        
          // Sleep for one second before repeating the loop
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	private void setTime() {
		// TODO Auto-generated method stub
		
	}
}