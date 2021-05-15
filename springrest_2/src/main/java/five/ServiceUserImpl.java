package five;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import four.User;
import six.UserService;

@Service
public class ServiceUserImpl implements UserService {

	List<User> users;

	public ServiceUserImpl() {
		users = new ArrayList<>();
		users.add(new User("pesala", "pesala"));
		users.add(new User("damaruka", "damaruka"));
		users.add(new User("mohana", "mohana"));
		users.add(new User("sai", "sai"));
		users.add(new User("krishna", "krishna"));
		
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}
