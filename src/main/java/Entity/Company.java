package Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Company {

    private Long COMPANY_ID;
    private String NAME;

    public Company() {
    }
}
