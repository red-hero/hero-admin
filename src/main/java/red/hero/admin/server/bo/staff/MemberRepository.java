package red.hero.admin.server.bo.staff;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository  extends JpaRepository<Member, Long> {

    List<Member> findByLastNameStartsWithIgnoreCase(String lastName);

    /* A version to fetch List instead of Page to avoid extra count query. */
    List<Member> findAllBy(Pageable pageable);

    List<Member> findByLastNameLikeIgnoreCase(String nameFilter);

    // For lazy loading and filtering
    List<Member> findByLastNameLikeIgnoreCase(String nameFilter, Pageable pageable);

    long countByLastNameLike(String nameFilter);

}
