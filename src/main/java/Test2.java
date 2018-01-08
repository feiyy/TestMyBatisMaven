import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neuedu.mapper.SuserMapper;
import com.neuedu.model.po.Suser;


public class Test2 {

	public static void main(String[] args) {
		//·�������src��·��
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		
			//����session����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		    //���һ�����ݿ�����
			SqlSession session = sqlSessionFactory.openSession();

			SuserMapper suserMapper = session.getMapper(SuserMapper.class);
		
			List<Suser> users = suserMapper.getAllUsers();
			
			System.out.println(users.size());
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    
	
	}

}
