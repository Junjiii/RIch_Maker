package richmaker.richmaker.domain.users.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "users_id")
    private Long id;

    private String name;
    private String phoneNumber;
    private String password;
    private String profileImageURL;
    private String CI;

    public Users(String name, String phoneNumber, String password, String profileImageURL, String CI) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.profileImageURL = profileImageURL;
        this.CI = CI;
    }
}
