package kr.co.ojy.bulletin.service.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kr.co.ojy.common.entity.BulletinElement;
import kr.co.ojy.common.entity.BulletinElementType;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ActionBulletinOrder implements BulletinOrder {
    @JsonIgnore
    private final List<String> relatedUrlKeys;
    private final String title;
    private final String roleOwner;
    private final String content;
    private final String bulletinType;
    private final Boolean isStandUp;
    private final BulletinElementType type;

    public ActionBulletinOrder(BulletinElement bulletinElement) {
        this.title = bulletinElement.getTitle();
        this.roleOwner = bulletinElement.getRoleOwner();
        this.content = bulletinElement.getContent();
        this.bulletinType = bulletinElement.getBulletinElementType().name();
        this.isStandUp = bulletinElement.getIsStandUp();
        this.type = bulletinElement.getBulletinElementType();
        this.relatedUrlKeys = bulletinElement.getUrlKeys();
    }

    @Override
    public List<String> getRelatedUrls() {
        return this.relatedUrlKeys.stream().map(key -> "/" + this.bulletinType.toLowerCase() + "/" + key).collect(Collectors.toList());
    }
}
