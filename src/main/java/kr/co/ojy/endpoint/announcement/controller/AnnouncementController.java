package kr.co.ojy.endpoint.announcement.controller;

import kr.co.ojy.constant.Endpoint;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(Endpoint.ANNOUNCEMENT)
public class AnnouncementController {
}
