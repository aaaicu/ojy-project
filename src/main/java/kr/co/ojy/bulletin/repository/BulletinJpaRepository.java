package kr.co.ojy.bulletin.repository;

import kr.co.ojy.domain.Bulletin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BulletinJpaRepository extends JpaRepository<Bulletin, Long> {
}
