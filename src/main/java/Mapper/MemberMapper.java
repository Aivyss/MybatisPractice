package Mapper;

import Entity.Member;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    public boolean createMembers(@Param("members") List<Member> members);
    public List<Member> selectMembersById(@Param("memberIds")List<Long> memberIds, @Param("companyId") Long companyId);
}
