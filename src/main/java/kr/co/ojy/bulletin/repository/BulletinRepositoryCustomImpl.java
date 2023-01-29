package kr.co.ojy.bulletin.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.co.ojy.domain.Bulletin;
import lombok.RequiredArgsConstructor;

import static kr.co.ojy.domain.QBulletin.bulletin;
import static kr.co.ojy.domain.QBulletinElement.bulletinElement;

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
