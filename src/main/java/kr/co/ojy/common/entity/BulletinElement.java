package kr.co.ojy.common.entity;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@TypeDef(name = "list-string", typeClass = ListArrayType.class)
public class BulletinElement extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BULLETIN_ELEMENT_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "ROLE_OWNER")
    private String roleOwner;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "IS_STAND_UP")
    private Boolean isStandUp;

    @Type(type = "list-string")
    @Column(name = "URL_KEYS")
    private List<String> urlKeys;

    @Column(name = "BULLETIN_ELEMENT_TYPE")
    @Enumerated(value = EnumType.STRING)
    private BulletinElementType bulletinElementType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BULLETIN_ID")
    private Bulletin bulletin;

}
