package kr.co.ojy.bulletin.service.domain;

import kr.co.ojy.common.entity.BulletinElement;
import kr.co.ojy.common.entity.BulletinElementType;
import lombok.Getter;

import java.util.List;

@Getter
public class PlainBulletinOrder implements BulletinOrder {

    private final String title;
    private final String roleOwner;
    private final String content;
    private final String bulletinType;
    private final Boolean isStandUp;
    private final BulletinElementType type;


    public PlainBulletinOrder(BulletinElement bulletinElement) {
        this.title = bulletinElement.getTitle();
        this.roleOwner = bulletinElement.getRoleOwner();
        this.content = bulletinElement.getContent();
        this.bulletinType = bulletinElement.getBulletinElementType().name();
        this.isStandUp = bulletinElement.getIsStandUp();
        this.type = bulletinElement.getBulletinElementType();
    }

    @Override
    public List<String> getRelatedUrls() {
        return List.of();
    }
}
