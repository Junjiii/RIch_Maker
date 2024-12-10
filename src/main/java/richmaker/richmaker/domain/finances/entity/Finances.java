package richmaker.richmaker.domain.finances.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Finances {

    @Id
    @GeneratedValue
    @Column(name = "finances_id")
    private Long id;

    private String name;
    private String imageURL;


    @Enumerated(EnumType.STRING)
    private FinanceType financeType;

    public Finances(String name, String imageURL, FinanceType financeType) {
        this.name = name;
        this.imageURL = imageURL;
        this.financeType = financeType;
    }
}
