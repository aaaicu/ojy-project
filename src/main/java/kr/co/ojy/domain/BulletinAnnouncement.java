package kr.co.ojy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class BulletinAnnouncement extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "WORSHIP_ANNOUNCEMENT_ID")
    private Long id;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private Bulletin bulletin;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private Announcement announcement;

}
