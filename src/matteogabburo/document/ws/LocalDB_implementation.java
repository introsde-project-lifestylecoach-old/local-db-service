package matteogabburo.document.ws;

import javax.jws.WebService;

import matteogabburo.document.models.User;

@WebService(endpointInterface = "matteogabburo.document.ws.LocalDB_interface", serviceName="local-db-service")
public class LocalDB_implementation implements LocalDB_interface{

	@Override
	public User get_user_by_id(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get_user_by_auth(String mail, String passwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update_user(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete_user(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
