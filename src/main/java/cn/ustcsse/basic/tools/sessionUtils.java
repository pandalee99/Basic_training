package cn.ustcsse.basic.tools;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class sessionUtils {
    private static SqlSessionFactory factory=null;
    static{
        try {
            //加载配置文件
            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取数据库连接
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=null;
        if(factory!=null){
            //sqlSession = factory.openSession();//默认手动，提交事务
          sqlSession= factory.openSession(true);//设置事务，自动提交
        }
        return sqlSession;
    }
}