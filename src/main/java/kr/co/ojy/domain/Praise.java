package kr.co.ojy.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Praise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRAISE_ID")
    private String id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PRAISE_URL")
    private String praiseUrl;

    @Column(name = "LYRICS")
    @Lob
    private String lyrics;
}
