package kr.co.ojy.church.endpoint;

import kr.co.ojy.church.endpoint.response.ChurchTitleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Transactional
public class ChurchFacade {

    public ChurchTitleResponse getBullentinTitle(String churchId) {
        return ChurchTitleResponse.builder()
                .churchTitle("test")
                .motto("testMotto")
                .build();
    }
}
