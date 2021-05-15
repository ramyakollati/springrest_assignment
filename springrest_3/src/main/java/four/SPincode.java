package four;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import three.Pincode;
@Service
public class SPincode implements Pin {
	
	List<Pincode> pin;

	public SPincode() {
		pin = new ArrayList<>();
		pin.add(new Pincode(524003,"AP","Nellore","India"));
		pin.add(new Pincode(524002,"AP","Nellore Rural","India"));
		pin.add(new Pincode(263139,"AP","Nellore Arban","India"));
		
			
	}
	
	public Pincode getDetails(int pincode) {
		for(Pincode p : pin)
			{
			if(p.getPin()==pincode)
				{
				System.out.println(p);
			    return p;
			    }
			}
		return null;
		
	}
	
	
	

}
