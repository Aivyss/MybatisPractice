package Runner;

import Entity.Member;
import Mapper.MemberMapper;
import factory.SessionFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class MainRunner {

    public static void main(String[] args) {
        List<Long> memberIds = Arrays.asList(1L, 2L, 3L);
        Long companyId = 1L;

        final List<Member> members = selectMembers(memberIds, companyId);
        System.out.println(members);
    }

    public static boolean createMembers(List<Member> members) {
        final SqlSession session = SessionFactory.getSession();
        boolean returnVal = false;

        try {
            final MemberMapper mapper = session.getMapper(MemberMapper.class);
            returnVal = mapper.createMembers(members);

            session.commit();
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return returnVal;
    }

    public static List<Member> selectMembers(List<Long> memberIds, Long companyId) {
        final SqlSession session = SessionFactory.getSession();
        List<Member> members = new ArrayList<>();

        try {
            final MemberMapper mapper = session.getMapper(MemberMapper.class);
            members = mapper.selectMembersById(memberIds, companyId);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return members;
    }
}
