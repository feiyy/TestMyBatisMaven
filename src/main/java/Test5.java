import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neuedu.mapper.UserInfoMapper;


public class Test5 {

	public static void main(String[] args) {
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
			//构建session工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		    //获得一个数据库连接
			SqlSession session = sqlSessionFactory.openSession();
			
			UserInfoMapper userInfoMapper = session.getMapper(UserInfoMapper.class);
		
		    userInfoMapper.getAllUsers();
		    
		    session.close();
		    
		    //userInfoMapper.deleteUser(19);
		    
		    //session.commit();
		    		    
            SqlSession session2 = sqlSessionFactory.openSession();
			
			UserInfoMapper userInfoMapper2 = session2.getMapper(UserInfoMapper.class);
		    		    
		    //userInfoMapper2.getAllUsers();
			userInfoMapper2.getUserById(18);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
