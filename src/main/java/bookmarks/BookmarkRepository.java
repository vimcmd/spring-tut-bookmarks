package bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {


    // will basically create a JPA query of the form (roughly)
    // 'select b from Bookmark b where b.account.username = :username'
    // and passing method argument 'username' (username is the property on the Bookmark entity's Account relationship
    // and ultimately requires a join of some sort) as a named parameter for the query
    Collection<Bookmark> findByAccountUsername(String username);

}
