package kr.co.ojy.bulletin.repository;

import kr.co.ojy.common.entity.Bulletin;

public interface BulletinRepositoryCustom {
    Bulletin findByBulletinId(Long bulletinId);
}
