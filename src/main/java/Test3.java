import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neuedu.mapper.SorderMapper;
import com.neuedu.mapper.SuserMapper;
import com.neuedu.model.po.Orderdetails;
import com.neuedu.model.po.Sorder;
import com.neuedu.model.po.Suser;
import com.neuedu.model.po.Userinfo;


public class Test3 {

	public static void main(String[] args) {
		//·�������src��·��
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		
			//����session����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		    //���һ�����ݿ�����
			SqlSession session = sqlSessionFactory.openSession();

			SorderMapper sorderMapper = session.getMapper(SorderMapper.class);
		
			/*Sorder o = sorderMapper.getOrderById(1);
			System.out.println(o.getOid()+"\t"+o.getOaddress()+"\t" +o.getU().getName());
			List<Orderdetails> details = o.getDetails();
			for(Orderdetails od: details)
			{
				System.out.println(od.getP().getPname()+od.getP().getPdesc()+od.getPrice() + od.getPcount());
			}*/
				
			Sorder s = sorderMapper.getOrderByIdTwo(1);
			
			Userinfo u = s.getU();
			System.out.println(u.getName());
			
			List<Orderdetails> details = s.getDetails();
			for(Orderdetails item: details)
			{
				System.out.println(item.getP().getPname());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
