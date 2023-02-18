package kr.co.ojy.bulletin.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.co.ojy.common.entity.Bulletin;
import lombok.RequiredArgsConstructor;

import static kr.co.ojy.common.entity.QBulletin.bulletin;
import static kr.co.ojy.common.entity.QBulletinElement.bulletinElement;

@RequiredArgsConstructor
public class BulletinRepositoryCustomImpl implements BulletinRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Bulletin findByBulletinId(Long bulletinId) {
        return jpaQueryFactory
                .select(bulletin)
                .from(bulletin)
                .join(bulletinElement).on(bulletin.id.eq(bulletinElement.bulletin.id))
                .fetchJoin()
                .where(bulletin.id.eq(bulletinId))
                .fetchOne();
    }

}
