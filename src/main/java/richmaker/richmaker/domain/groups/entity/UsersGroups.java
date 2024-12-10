package richmaker.richmaker.domain.groups.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import richmaker.richmaker.domain.users.entity.Users;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UsersGroups {


    @Id
    @GeneratedValue
    @Column(name = "users_groups_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groups_id")
    private Groups groups;

    @Enumerated(EnumType.STRING)
    private UsersGroupsStatus status;


    public UsersGroups(Users users, Groups groups, UsersGroupsStatus status) {
        this.users = users;
        this.groups = groups;
        this.status = status;
    }
}
