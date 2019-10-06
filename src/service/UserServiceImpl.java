package service;

import java.util.List;

import com.dao.UserDaoImpl;
import com.dao.UserInfoDao;
import com.model.UserInfo;

public class UserServiceImpl implements UserService {
	private UserInfoDao dao = new  UserDaoImpl();

	@Override
	public int register(UserInfo userinfo) {
		// TODO Auto-generated method stub
		return dao.register(userinfo);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public UserInfo updateUser(UserInfo u) {
		// TODO Auto-generated method stub
		return dao.updateUser(u);
	}

	@Override
	public UserInfo listUserById(int id) {
		// TODO Auto-generated method stub
		return dao.listUserById(id);
	}

	@Override
	public List<UserInfo> listAllUsers() {
		// TODO Auto-generated method stub
		return dao.listAllUsers();
	}

}
