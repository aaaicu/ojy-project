package kr.co.ojy.endpoint.church.facade;

import kr.co.ojy.endpoint.church.data.response.ChurchTitleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Transactional
public class ChurchFacade {

    public ChurchTitleResponse getBullentinTitle(String churchId) {

        return ChurchTitleResponse.builder().build();
    }
}
