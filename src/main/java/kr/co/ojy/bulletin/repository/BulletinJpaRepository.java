package kr.co.ojy.bulletin.repository;

import kr.co.ojy.common.entity.Bulletin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulletinJpaRepository extends JpaRepository<Bulletin, Long> {
}
