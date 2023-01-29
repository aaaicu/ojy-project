package kr.co.ojy.bulletin.repository;

import kr.co.ojy.domain.Bulletin;

public interface BulletinRepositoryCustom {
    Bulletin findByBulletinId(Long bulletinId);
}
