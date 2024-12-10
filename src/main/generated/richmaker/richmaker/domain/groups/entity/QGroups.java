package richmaker.richmaker.domain.groups.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGroups is a Querydsl query type for Groups
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGroups extends EntityPathBase<Groups> {

    private static final long serialVersionUID = 665091619L;

    public static final QGroups groups = new QGroups("groups");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QGroups(String variable) {
        super(Groups.class, forVariable(variable));
    }

    public QGroups(Path<? extends Groups> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGroups(PathMetadata metadata) {
        super(Groups.class, metadata);
    }

}

