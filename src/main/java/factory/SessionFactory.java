package factory;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory {
    public static SqlSession getSession() {
        SqlSession session = null;

        try (InputStream input = Resources.getResourceAsStream("mybatis-config.xml")) {
            final SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);

            session = factory.openSession(true);
        } catch(IOException e) {
            e.printStackTrace();
        }

        return session;
    }
}
