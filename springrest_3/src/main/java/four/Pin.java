package four;

import org.springframework.stereotype.Service;

import three.Pincode;

@Service
public interface Pin {

	public Pincode getDetails(int pincode);

}
