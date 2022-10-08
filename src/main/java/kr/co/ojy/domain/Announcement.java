package kr.co.ojy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANNOUNCEMENT_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "ANNOUNCEMENT_TYPE")
    private AnnouncementType announcementType;

    @ManyToMany
    @JoinTable(name = "BULLETIN_ELEMENT_ANNOUNCEMENT")
    private List<BulletinElement> bulletinElements;
}
