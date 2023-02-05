package kr.co.ojy.praise.endpoint;

import kr.co.ojy.common.constant.Endpoint;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(Endpoint.PRAISE)
public class PraiseController {
}
