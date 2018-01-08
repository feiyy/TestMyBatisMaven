import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neuedu.mapper.UserInfoMapper;
import com.neuedu.model.po.Sorder;
import com.neuedu.model.po.Userinfo;


public class Test {

	public static void main(String[] args) {
		try {
			//·�������src��·��
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			//����session����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		    //���һ�����ݿ�����
			SqlSession session = sqlSessionFactory.openSession();
			/**
			 * class $Proxy2 implements UserInfoMapper
			 * {
			 *     public List<Userinfo> getAllUsers()
			 *     {
			 *          Connection conn = �������
			 *          PreparedStatement ps = conn.prepareStatement("select * from userinfo");
			 *          Result rs = 
			 *          while(rs.next())
			 *          {
			 *             list.add();
			 *          
			 *          }          
			 *          return list;
			 *     }
			 * }
			 */
			
			UserInfoMapper userInfoMapper = session.getMapper(UserInfoMapper.class);
			
			/*List<Userinfo> users = userInfoMapper.getAllUsers();
			
			System.out.println(users.size());*/
			
			/*Userinfo u = userInfoMapper.getUserById(1);
			
			System.out.println(u.getName());*/
			
			/*List<Userinfo> users = userInfoMapper.getUsersByName("x");
			System.out.println(users.size());*/
			
			/*Userinfo u = new Userinfo();
			u.setName("xx");
			u.setSex("��");
			List<Userinfo> users =  userInfoMapper.getUsersByCondition(u);
			System.out.println(users.size());*/
			
			/*Map<String, Object> m = new HashMap<>();
			m.put("name", "xx");
			m.put("sex", "��");
			List<Userinfo> users =  userInfoMapper.getUsersByCondition2(m);
			System.out.println(users.size());*/
			
			/*Userinfo u = new Userinfo();
			u.setName("add6");
			u.setSex("Ů");
			u.setBirthday(Timestamp.valueOf("2010-1-1 12:12:12"));
			u.setSal(5000.5);
			userInfoMapper.addUser(u);
			
			System.out.println(u.getId());
			
			session.commit();*/
			
		/*	Userinfo u = new Userinfo();
			u.setId(14);
			//u.setName("add2");
			u.setSex("��");
			u.setBirthday(Timestamp.valueOf("1997-1-1 12:12:12"));
			//u.setSal(8660.5);
			
			userInfoMapper.updateUser(u);
			
			session.commit();*/
			
			/*userInfoMapper.deleteUser(14);
			session.commit();*/
			
			/*Userinfo u = new Userinfo();
			u.setId(7);
			u.setName("xx");
			u.setSex("M");
			
			List<Userinfo> users = userInfoMapper.getUsers(u);
			for(Userinfo item: users)
			{
				System.out.println(item.getName());
			}*/
			
			/*List<Integer> ids = new ArrayList<>();
			ids.add(1);
			ids.add(2);
			ids.add(3);
			ids.add(4);
			
			List<Userinfo> users = userInfoMapper.getUsersByIds(ids);
			for(Userinfo u: users)
			{
				System.out.println(u.getName());
			}*/
			
			/*int[] ids = new int[4];
			ids[0] = 1;
			ids[1] = 2;
			ids[2] = 3;
			ids[3] = 4;
			
			List<Userinfo> users = userInfoMapper.getUsersByIdsTwo(ids);
			for(Userinfo u: users)
			{
				System.out.println(u.getName());
			}*/
			
			/*int[] ids = new int[4];
			ids[0] = 1;
			ids[1] = 2;
			ids[2] = 3;
			ids[3] = 4;
			
			Map m = new HashMap();
			m.put("name", "xx");
			m.put("ids", ids);
			
			userInfoMapper.deleteUsers(m);
			session.commit();*/
			
			List<Userinfo> users = userInfoMapper.getAllUsers();
			for(Userinfo u: users)
			{				
				System.out.println(u.getName());
				List<Sorder> orders = u.getOrders();
				for(Sorder s: orders)
				{
					System.out.println(s.getOaddress());
				}
				System.out.println("==============");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
