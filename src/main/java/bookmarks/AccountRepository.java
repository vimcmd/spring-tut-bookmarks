package bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    // will basically create a JPA query of the form
    // 'select a from Account a where a.username = :username'
    // and passing method argument 'username' as a named parameter for the query
    Optional<Account> findByUsername(String username);

}
