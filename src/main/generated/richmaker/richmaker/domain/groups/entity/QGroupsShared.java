package richmaker.richmaker.domain.groups.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGroupsShared is a Querydsl query type for GroupsShared
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGroupsShared extends EntityPathBase<GroupsShared> {

    private static final long serialVersionUID = -53366680L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGroupsShared groupsShared = new QGroupsShared("groupsShared");

    public final QGroups groups;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final richmaker.richmaker.domain.finances.entity.QUsersFinances usersFinances;

    public QGroupsShared(String variable) {
        this(GroupsShared.class, forVariable(variable), INITS);
    }

    public QGroupsShared(Path<? extends GroupsShared> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGroupsShared(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGroupsShared(PathMetadata metadata, PathInits inits) {
        this(GroupsShared.class, metadata, inits);
    }

    public QGroupsShared(Class<? extends GroupsShared> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.groups = inits.isInitialized("groups") ? new QGroups(forProperty("groups")) : null;
        this.usersFinances = inits.isInitialized("usersFinances") ? new richmaker.richmaker.domain.finances.entity.QUsersFinances(forProperty("usersFinances"), inits.get("usersFinances")) : null;
    }

}

