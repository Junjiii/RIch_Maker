package richmaker.richmaker.domain.finances.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsersFinances is a Querydsl query type for UsersFinances
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUsersFinances extends EntityPathBase<UsersFinances> {

    private static final long serialVersionUID = -1860342419L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUsersFinances usersFinances = new QUsersFinances("usersFinances");

    public final QFinances finance;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final richmaker.richmaker.domain.users.entity.QUsers user;

    public QUsersFinances(String variable) {
        this(UsersFinances.class, forVariable(variable), INITS);
    }

    public QUsersFinances(Path<? extends UsersFinances> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUsersFinances(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUsersFinances(PathMetadata metadata, PathInits inits) {
        this(UsersFinances.class, metadata, inits);
    }

    public QUsersFinances(Class<? extends UsersFinances> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.finance = inits.isInitialized("finance") ? new QFinances(forProperty("finance")) : null;
        this.user = inits.isInitialized("user") ? new richmaker.richmaker.domain.users.entity.QUsers(forProperty("user")) : null;
    }

}

