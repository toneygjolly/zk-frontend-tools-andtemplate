package toolbar;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Toolbar;
import org.zkoss.zul.Window;

public class tool extends SelectorComposer<Window>{
	@Wire 
	private Toolbar a1;
	@Listen("onClick=#a1")
	public void a1() {
		alert("location:India");
	}
	@Wire 
	private Toolbar a2;
	@Listen("onClick=#a2")
	public void a2() {
		alert("welcome to home page");
	}

}
