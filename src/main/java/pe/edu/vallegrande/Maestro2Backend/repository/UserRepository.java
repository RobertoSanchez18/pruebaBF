package pe.edu.vallegrande.Maestro2Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import pe.edu.vallegrande.Maestro2Backend.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Modifying
    @Query(value = "delete User u where u.id = ?1")
    void deleteUser(Long id);

}
