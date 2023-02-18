package kr.co.ojy.church.endpoint;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.co.ojy.bulletin.service.domain.ActionBulletinOrder;
import kr.co.ojy.common.constant.Endpoint;
import kr.co.ojy.common.constant.path.Church;
import kr.co.ojy.church.endpoint.response.ChurchTitleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "church", description = "교회 정보 API")
@RestController
@RequiredArgsConstructor
@RequestMapping(Endpoint.CHURCH)
public class ChurchController {

    private final ChurchFacade churchFacade;

    @Operation(summary = "교회 이름 요청", description = "교회 ID를 받아서 교회이름 반환")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ChurchTitleResponse.class)))
    })
    @Parameters({
            @Parameter(name = "churchId", description = "교회 식별 Id", example = "1")
    })
    @GetMapping(Church.CHURCH_TITLE)
    public ResponseEntity<ChurchTitleResponse> getBullentinTitle(@PathVariable String churchId) {
        return ResponseEntity.ok(churchFacade.getBullentinTitle(churchId));
    }
}
