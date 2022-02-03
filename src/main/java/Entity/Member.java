package Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Member {

    private Long MEMBER_ID;
    private Long COMPANY_ID;
    private String NAME;

    public Member() {
    }
}
