package kr.co.ojy.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Praise extends BaseEntity{
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