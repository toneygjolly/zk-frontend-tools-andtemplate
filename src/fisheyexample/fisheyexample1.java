package fisheyexample;


import org.zkoss.image.Image;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zkex.zul.Fisheyebar;
import org.zkoss.zul.Label;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Window;

import com.sun.java.swing.plaf.gtk.GTKConstants.Orientation;

public class fisheyexample1 extends SelectorComposer<Component>{
	@Wire
	private Fisheyebar fisheyebar;
	@Wire 
	private Image img1;
	@Wire
	private Label instagram;
	@Listen("onClick=#img1")
	public void instagram() {
		alert("instagram is not available");
	}
	@Wire
	private Label horizontal;
	@Listen("onClick=#horizontal")
//	public void horizontal() {
	public	void changeOrientation(ForwardEvent event) {
            Radiogroup group = (Radiogroup) event.getTarget();
            String selectedValue = (String) group.getSelectedItem().getValue();
            fisheyebar.setOrient(selectedValue);
        }
//		fisheyebar.setOrient(Orientation.HORIZONTAL);
//		fisheyebar.setHorizontal();
//	}

}
