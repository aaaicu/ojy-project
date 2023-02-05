package kr.co.ojy.bulletin.service;

import kr.co.ojy.bulletin.repository.BulletinRepository;
import kr.co.ojy.bulletin.service.dto.BulletinDTO;
import kr.co.ojy.common.entity.Bulletin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BulletinService {
    private final BulletinRepository bulletinRepository;

    public BulletinDTO getBulletin(Long bulletinId) {
        Bulletin bulletin = bulletinRepository.findByBulletinId(bulletinId);
        return BulletinDTO.extract(bulletin);
    }
}
