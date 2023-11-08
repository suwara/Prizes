package ku.cs.prize.model;

import lombok.Data;

import java.util.Date;

@Data
public class ProfileRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Date birthday;

}
