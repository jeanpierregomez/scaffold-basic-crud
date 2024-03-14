package co.com.chapterback.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<UserEntity, String>, QueryByExampleExecutor<UserEntity> {
}
