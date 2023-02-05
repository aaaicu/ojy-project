package kr.co.ojy.church.endpoint.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ChurchTitleResponse {
    private String churchTitle;
    private String motto;
}
