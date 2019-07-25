package dao1;

import pojo.UserDetails;

public class LoginDaoImpl1 implements LoginDao{
	public boolean LoginValidate(UserDetails ref) {
		//connect with the DB here
			boolean status;
			if(ref.getEmailAddress()=="xyz@gmail.com" ) {
				status = true;
			}
			else{
				status = false;
			}
	      return status;
		
		

}
}
