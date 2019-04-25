package capstone.team9.proof.repositories;

import capstone.team9.proof.models.Proofs;
import capstone.team9.proof.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProofRepository extends MongoRepository<Object, String> {
    @Query(value = "{'userSubmitted': ?0}")
    List<Proofs> findProofsByUser(String user);

    @Query(value = "{'entryType': ?0}")
    List<User> getAllUsers(String all);

    @Query(value = "{'entryType' : 'user', 'username' : ?0}")
    User getUserByUsername(String username);

}
