package IOC.IOC_Annotated.Cricket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")   // Making as prototype, it's create new object
public class Captain {
	public String cap;
	//String cap = "MSD";
	
	@Autowired
	public void setNameCap(@Value("MSD")String cap) {
		this.cap = cap;
	}


}
