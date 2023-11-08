package ku.cs.prize.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
public class Profile {
    @Id
    @GeneratedValue
    private UUID id;

    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Date birthday;

}
