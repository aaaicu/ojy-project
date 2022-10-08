package kr.co.ojy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Bulletin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BULLETIN_ID")
    private Long id;

    @Column(name = "EMCEE")
    private String emcee;          // 사회자

    @Column(name = "NEXT_EMCEE")
    private String nextEmcee;

    @Column(name = "NEXT_PRAYER")
    private String nextPrayer;

    @Column(name = "NEXT_OFFERING")
    private String nextOffering;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORSHIP_ID")
    private Worship worship;

    @OneToMany(mappedBy = "bulletin", fetch = FetchType.LAZY)
    private List<BulletinElement> bulletinElements = new ArrayList<>();
}
