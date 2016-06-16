package red.hero.admin.server.bo.staff;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository  extends JpaRepository<Member, Long> {

    List<Member> findByLastNameStartsWithIgnoreCase(String lastName);
}
