package two;

import org.springframework.stereotype.Service;

@Service
public interface CardServiceClass {

	String getCardType(long cardNo);

}