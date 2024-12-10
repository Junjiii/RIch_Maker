package richmaker.richmaker.domain.records.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import richmaker.richmaker.domain.category.entity.Categories;
import richmaker.richmaker.domain.finances.entity.Finances;
import richmaker.richmaker.domain.users.entity.Users;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Transactions {

    @Id
    @GeneratedValue
    @Column(name = "transactions_id")
    private Long id;

    private String detail;

    @Column(precision = 10,scale = 2)
    private BigDecimal amount;


    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private int installmentMonth;

    private LocalDateTime installmentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categories_id")
    private Categories category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "finances_id")
    private Finances finance;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users user;



    public Transactions(String detail,
                        BigDecimal amount,
                        TransactionType type,
                        int installmentMonth,
                        LocalDateTime installmentDate,
                        Categories category,
                        Finances finance,
                        Users user) {
        this.detail = detail;
        this.amount = amount;
        this.type = type;
        this.installmentMonth = installmentMonth;
        this.installmentDate = installmentDate;
        this.category = category;
        this.finance = finance;
        this.user = user;
    }
}
