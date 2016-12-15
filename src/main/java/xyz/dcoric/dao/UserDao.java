package xyz.dcoric.dao;

import org.springframework.data.repository.CrudRepository;
import xyz.dcoric.models.User;

import javax.transaction.Transactional;

/**
 * Created by denis on 15.12.2016..
 */
@Transactional
public interface UserDao extends CrudRepository<User, Long> {
    public User findByEmail(String email);
}
