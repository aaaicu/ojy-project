package kr.co.ojy.bulletin.endpoint;

import kr.co.ojy.bulletin.service.BulletinService;
import kr.co.ojy.bulletin.service.dto.BulletinDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
@RequiredArgsConstructor
public class BulletinFacade {

    private final BulletinService bulletinService;

    public BulletinDTO findBulletin(Long worshipId) {
        return bulletinService.getBulletin(worshipId);
    }

}
