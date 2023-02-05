package kr.co.ojy.bulletin.service.dto;

import kr.co.ojy.bulletin.service.domain.BulletinElementFactory;
import kr.co.ojy.bulletin.service.domain.BulletinOrder;
import kr.co.ojy.common.entity.Bulletin;
import kr.co.ojy.common.entity.BulletinElement;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Getter
public class BulletinDTO {
    private final List<BulletinOrder> bulletinOrders;
    private final String emcee;

    public static BulletinDTO extract(Bulletin bulletin) {
        List<BulletinElement> bulletinElements = bulletin.getBulletinElements();

        return BulletinDTO.builder()
                .emcee(bulletin.getEmcee())
                .bulletinOrders(bulletinElements.stream()
                        .map(BulletinElementFactory::createBulletinOrder)
                        .collect(Collectors.toList()))
                .build();
    }
}
