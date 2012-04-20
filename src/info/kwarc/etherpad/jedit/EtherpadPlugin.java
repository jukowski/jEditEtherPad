package info.kwarc.etherpad.jedit;

import org.gjt.sp.jedit.EditPlugin;
import org.gjt.sp.jedit.View;
import org.gjt.sp.jedit.jEdit;
import org.gjt.sp.util.Log;

public class EtherpadPlugin extends EditPlugin {

	public static String OPTION_PREFIX = "ETHERPADPLUGIN_";
	public static String NAME = "EtherpadPlugin";

	public static String getEtherpadURL() {
		return jEdit.getProperty(EtherpadPlugin.OPTION_PREFIX
				+ "etherpad-url");
	}

	public static void setEtherpadURL(String url) {
		jEdit.setProperty(EtherpadPlugin.OPTION_PREFIX
				+ "etherpad-url", url);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}

	public void connect(View view) {
		Log.log(Log.ERROR, "Heleeeeeeeeeeee", view.getEditPane().getBuffer().getPath());
	}
}
