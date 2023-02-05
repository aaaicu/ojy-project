package kr.co.ojy.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Announcement extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANNOUNCEMENT_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "ANNOUNCEMENT_TYPE")
    @Enumerated(value = EnumType.STRING)
    private AnnouncementType announcementType;

    @OneToMany(mappedBy = "announcement",fetch = FetchType.LAZY)
    private List<BulletinAnnouncement> bulletinAnnouncements;
}
