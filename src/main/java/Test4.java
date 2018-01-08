import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neuedu.mapper.EmpMapper;
import com.neuedu.mapper.SorderMapper;
import com.neuedu.model.po.Dept;
import com.neuedu.model.po.Emp;
import com.neuedu.model.po.Sorder;


public class Test4 {

	public static void main(String[] args) {
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
		
			//构建session工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		    //获得一个数据库连接
			SqlSession session = sqlSessionFactory.openSession();

			EmpMapper empMapper = session.getMapper(EmpMapper.class);
		
			/*List<Emp> emps = empMapper.getAllEmps();
			for(Emp e:emps)
			{
				System.out.println(e.getEname() + e.getD().getDname());
			}*/
			
			List<Dept> depts = empMapper.getAllDepts();
			for(Dept d: depts)
			{
				System.out.println(d.getDname());
				List<Emp> emps = d.getEmps();
				for(Emp e: emps)
				{
					System.out.println(e.getEname());
				}
				System.out.println("===================");
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
