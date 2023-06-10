package repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.ERole;
import models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
	
	Optional<Role> findByName(ERole name);

}
