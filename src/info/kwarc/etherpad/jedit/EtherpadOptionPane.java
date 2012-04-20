package info.kwarc.etherpad.jedit;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.gjt.sp.jedit.AbstractOptionPane;
import org.gjt.sp.util.Log;

public class EtherpadOptionPane extends AbstractOptionPane
	implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JTextField serverURL;
	private JButton checkServer;
	
	public EtherpadOptionPane() {
		super(EtherpadPlugin.NAME);
	}

	@Override
	protected void _init() {
		super._init();
		serverURL = new JTextField(EtherpadPlugin.getEtherpadURL(), 30);
	    checkServer = new JButton("Check server");
	    checkServer.setActionCommand("checkServer");
	    checkServer.addActionListener(this);

	    JPanel pathPanel = new JPanel(new FlowLayout());
        pathPanel.add(new JLabel("Etherpad-lite URL"));
        pathPanel.add(serverURL);
        pathPanel.add(checkServer);
        
        addComponent(pathPanel);
	}
	
	@Override
	protected void _save() {
		super._save();
		EtherpadPlugin.setEtherpadURL(serverURL.getText());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("checkServer")) {
			Log.log(Log.ERROR, this, e.getActionCommand());
		}
	}
}
