package test.exp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.exp.entities.User;
@Repository
public interface UserRep extends JpaRepository<User, Integer> {
}
