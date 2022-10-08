package kr.co.ojy.endpoint.bulletin.facade;

import kr.co.ojy.endpoint.bulletin.data.resposne.BulletinResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@RequiredArgsConstructor
public class BulletinFacade {

    public BulletinResponse findBulletin(Long worshipId) {
        return BulletinResponse.builder().build();
    }

}
