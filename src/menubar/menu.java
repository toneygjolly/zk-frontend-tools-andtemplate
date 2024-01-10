package menubar;



import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Window;

public class menu extends SelectorComposer<Window>{
	
	private static final long serialVersionUID=1L;  
	@Wire
	private Label mOpen;
	@Listen("onClick=#mOpen")
	public void mopen() {
		Executions.sendRedirect("formpage.zul");
	}
	@Wire
	private Label mOpen1;
	@Listen("onClick=#mOpen1")
	public void mopen1() {
		alert("hello");
	}
	@Wire
	private Button submitButton;
	@Listen("onClick=#submitButton")
	public void submitButton() {
		alert("Submit");
	}

}
