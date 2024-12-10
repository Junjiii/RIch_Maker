package richmaker.richmaker.domain.records.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransactions is a Querydsl query type for Transactions
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTransactions extends EntityPathBase<Transactions> {

    private static final long serialVersionUID = -1145127978L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransactions transactions = new QTransactions("transactions");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final richmaker.richmaker.domain.category.entity.QCategories category;

    public final StringPath detail = createString("detail");

    public final richmaker.richmaker.domain.finances.entity.QFinances finance;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> installmentDate = createDateTime("installmentDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> installmentMonth = createNumber("installmentMonth", Integer.class);

    public final EnumPath<TransactionType> type = createEnum("type", TransactionType.class);

    public final richmaker.richmaker.domain.users.entity.QUsers user;

    public QTransactions(String variable) {
        this(Transactions.class, forVariable(variable), INITS);
    }

    public QTransactions(Path<? extends Transactions> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransactions(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransactions(PathMetadata metadata, PathInits inits) {
        this(Transactions.class, metadata, inits);
    }

    public QTransactions(Class<? extends Transactions> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new richmaker.richmaker.domain.category.entity.QCategories(forProperty("category")) : null;
        this.finance = inits.isInitialized("finance") ? new richmaker.richmaker.domain.finances.entity.QFinances(forProperty("finance")) : null;
        this.user = inits.isInitialized("user") ? new richmaker.richmaker.domain.users.entity.QUsers(forProperty("user")) : null;
    }

}

