package kr.co.ojy.church.endpoint;

import kr.co.ojy.common.constant.Endpoint;
import kr.co.ojy.common.constant.path.Church;
import kr.co.ojy.church.endpoint.response.ChurchTitleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(Endpoint.CHURCH)
public class ChurchController {

    private final ChurchFacade churchFacade;

    @GetMapping(Church.CHURCH_TITLE)
    public ResponseEntity<ChurchTitleResponse> getBullentinTitle(@PathVariable String churchId) {
        return ResponseEntity.ok(churchFacade.getBullentinTitle(churchId));
    }
}
