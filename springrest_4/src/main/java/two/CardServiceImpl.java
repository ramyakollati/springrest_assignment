package two;

import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardServiceClass {

	@Override
	public String getCardType(long cardNo) {
		int length = String.valueOf(cardNo).length();
		if(length==16)
		{
			if(1010101010101010L<=cardNo && cardNo<=2020202020202020L)
				return "American Express";
			if(3030303030303030L<=cardNo && cardNo<=4040404040404040L)
				return "American Express";
		}
		if(length==15)
		{
			if(505050505050505L<=cardNo && cardNo<= 606060606060606L)
				return "enRoute";
			
		}
		
		if(length==16)
		{
			if(7070707070707070L<=cardNo && cardNo<= 8080808080808080L)
				return "MasterCard";
			
		}
		
		if(length==19) {
			if(9090909090909090909L<=cardNo && cardNo<=1100110011001100110L)
				return "Visa";
			}
	return "No type Specified";
	}
	

}
