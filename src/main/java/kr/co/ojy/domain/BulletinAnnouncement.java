package kr.co.ojy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

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

    @Column(name = "START_DATETIME")
    private LocalDateTime startDateTime;

    @Column(name = "END_DATETIME")
    private LocalDateTime endDateTime;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private Announcement announcement;

}
