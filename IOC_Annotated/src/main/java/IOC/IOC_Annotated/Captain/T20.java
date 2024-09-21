package IOC.IOC_Annotated.Captain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import IOC.IOC_Annotated.Cricket.Captain;


@Component
public class T20 {
	String formate;
	Captain captain;
	
	@Autowired
	public T20(@Value("T20 Team captain is : ")String formate) {
		this.formate = formate;
	}
	
	
	@Autowired
	public void setCaptain(Captain captain) {
		this.captain = captain;
	}
	
	
	public void disp() {
		System.out.println(formate+" "+ captain.cap+" :  "+captain);
	}

}
