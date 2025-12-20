ConflictFlagRepositoryConflictFlagRepositoryConflictFlagRepositoryConflictFlagRepositoryConflictFlagRepositoryConflictFlagRepository
import com.example.demo.model.ConflictCase;

@Repository
public interface ConflictCaseRepository extends JpaRepository <ConflictCase,Long>{
    
    List<ConflictCase> findByPrimaryPersonIdOrSecondaryPersonId(
            Long primaryPersonId,
            Long secondaryPersonId
    );
}