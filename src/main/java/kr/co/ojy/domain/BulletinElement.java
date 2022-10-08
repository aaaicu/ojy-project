package kr.co.ojy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class BulletinElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BULLETIN_ELEMENT_ID")
    private Long id;

    @Column(name = "ROLE_OWNER")
    private String roleOwner;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "DETAIL_CONTENT")
    private String detailContent;

    @Column(name = "IS_STAND_UP_START")
    private Boolean isStandUpStart;

    @Column(name = "URL_KEY")
    private String urlKey;

    @Column(name = "BULLETIN_ELEMENT_TYPE")
    private BulletinElementType bulletinElementType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BULLETIN_ID")
    private Bulletin bulletin;

}
