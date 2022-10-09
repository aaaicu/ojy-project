package kr.co.ojy.endpoint.church.controller;

import kr.co.ojy.constant.Endpoint;
import kr.co.ojy.constant.path.Church;
import kr.co.ojy.endpoint.church.data.response.ChurchTitleResponse;
import kr.co.ojy.endpoint.church.facade.ChurchFacade;
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
