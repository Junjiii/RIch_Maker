package richmaker.richmaker.domain.groups.entity;


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
public class Groups {

    @Id
    @GeneratedValue
    @Column(name = "groups_id")
    private Long id;
    private String name;

    public Groups(String name) {
        this.name = name;
    }
}
