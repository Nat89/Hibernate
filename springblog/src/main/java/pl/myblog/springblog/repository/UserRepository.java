package pl.myblog.springblog;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.myblog.springblog.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
