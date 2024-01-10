package captcha;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Captcha;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class captcha extends SelectorComposer<Window>{
	
	private static final long serialVersionUID=1L;
	@Wire
	private Textbox t;
	@Wire
	private Captcha cpa;
	@Wire
	private Button reset;
	@Listen("onClick=#reset")
	public void rest() {
		cpa.randomValue();
		//cpa.setValue("computer");
		//cpa.setValue("FIND");
	}
	@Wire
	private Button b1;
	@Listen("onClick=#b1")
	public void b1() {
		String cvalue=t.getValue();
		String ccpa=cpa.getValue();
		if(ccpa.equals(cvalue)) {
			alert("correct");
		}
		else {
			alert("wrong");
		}
	}

}
