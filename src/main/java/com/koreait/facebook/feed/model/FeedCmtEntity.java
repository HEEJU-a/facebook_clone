package com.koreait.facebook.feed.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class FeedCmtEntity {
    private int icmt;
    private int ifeed;
    private int iuser;
    private String cmt;
    private String regdt;
}
