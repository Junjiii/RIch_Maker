package richmaker.richmaker.domain.category.entity;


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
public class Categories {

    @Id
    @GeneratedValue
    @Column(name = "categories_id")
    private Long id;

    private String name;

    public Categories(String name) {
        this.name = name;
    }
}
