package jrat.theme.darcula;

import com.bulenkov.darcula.DarculaLaf;
import javax.swing.UIManager;
import jrat.api.Plugin;

public class Darcula extends Plugin {

	public Darcula() {
		super("Darcula Theme", "1.0", "Dark Theme", "jRAT");

		try {
			UIManager.setLookAndFeel(new DarculaLaf());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
