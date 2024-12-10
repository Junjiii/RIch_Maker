package richmaker.richmaker.domain.groups.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsersGroups is a Querydsl query type for UsersGroups
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUsersGroups extends EntityPathBase<UsersGroups> {

    private static final long serialVersionUID = -1379441907L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUsersGroups usersGroups = new QUsersGroups("usersGroups");

    public final QGroups groups;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<UsersGroupsStatus> status = createEnum("status", UsersGroupsStatus.class);

    public final richmaker.richmaker.domain.users.entity.QUsers users;

    public QUsersGroups(String variable) {
        this(UsersGroups.class, forVariable(variable), INITS);
    }

    public QUsersGroups(Path<? extends UsersGroups> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUsersGroups(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUsersGroups(PathMetadata metadata, PathInits inits) {
        this(UsersGroups.class, metadata, inits);
    }

    public QUsersGroups(Class<? extends UsersGroups> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.groups = inits.isInitialized("groups") ? new QGroups(forProperty("groups")) : null;
        this.users = inits.isInitialized("users") ? new richmaker.richmaker.domain.users.entity.QUsers(forProperty("users")) : null;
    }

}

