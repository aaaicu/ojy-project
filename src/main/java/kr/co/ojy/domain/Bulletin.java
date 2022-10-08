package kr.co.ojy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

}
