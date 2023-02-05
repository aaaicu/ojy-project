package kr.co.ojy.bulletin.service.domain;

import kr.co.ojy.common.entity.BulletinElement;

public class BulletinElementFactory {
    public static BulletinOrder createBulletinOrder(BulletinElement bulletinElement) {
        return switch (bulletinElement.getBulletinElementType()) {
            case BASIC -> new PlainBulletinOrder(bulletinElement);
            case CUSTOM, PRAISE, SERMON -> new ActionBulletinOrder(bulletinElement);
        };
    }
}
