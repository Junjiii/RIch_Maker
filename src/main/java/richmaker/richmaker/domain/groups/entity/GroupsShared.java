package richmaker.richmaker.domain.groups.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.internal.util.stereotypes.Lazy;
import richmaker.richmaker.domain.finances.entity.UsersFinances;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GroupsShared {

    @Id
    @GeneratedValue
    @Column(name = "groups_shared_id")
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groups_id")
    private Groups groups;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_finances_id")
    private UsersFinances usersFinances;


    public GroupsShared(Groups groups, UsersFinances usersFinances) {
        this.groups = groups;
        this.usersFinances = usersFinances;
    }
}
