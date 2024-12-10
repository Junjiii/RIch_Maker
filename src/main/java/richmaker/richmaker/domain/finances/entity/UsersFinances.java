package richmaker.richmaker.domain.finances.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import richmaker.richmaker.domain.users.entity.Users;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UsersFinances {

    @Id
    @GeneratedValue
    @Column(name = "users_finances_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users user;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "finances_id")
    private Finances finance;

    public UsersFinances(Users user, Finances finance) {
        this.user = user;
        this.finance = finance;
    }
}
