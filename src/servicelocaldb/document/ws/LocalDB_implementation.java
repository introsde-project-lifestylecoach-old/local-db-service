package servicelocaldb.document.ws;

import javax.jws.WebService;

import servicelocaldb.document.dao.UserDao;
import servicelocaldb.document.models.User;

@WebService(endpointInterface = "servicelocaldb.document.ws.LocalDB_interface", serviceName="local-db-service")
public class LocalDB_implementation implements LocalDB_interface{

	@Override
	public User get_user_by_id(Long id) {
		UserDao dao = new UserDao();
		return dao.getUserById(id);
	}

	@Override
	public User get_user_by_auth(String mail, String passwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update_user(User user) {
		UserDao dao = new UserDao();
		return dao.update(user);
	}

	@Override
	public User delete_user(User user) {
		UserDao dao = new UserDao();
		return dao.delete(user);
	}

	@Override
	public User create_user(User user) {
		UserDao dao = new UserDao();
		return dao.save(user);
	}


}
