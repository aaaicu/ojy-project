package kr.co.ojy.endpoint.church.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import kr.co.ojy.constant.Endpoint;
import kr.co.ojy.constant.path.Church;
import kr.co.ojy.endpoint.bulletin.data.resposne.BulletinResponse;
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

    @Operation(summary = "교회 데이터 요청", description = "교회 ID를 받아서 주보 상단에 보여줄 타이틀 반환")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ChurchTitleResponse.class))),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    @Parameters({
            @Parameter(name = "churchId", description = "교회 식별 Id", example = "1234")
    })
    @GetMapping(Church.CHURCH_TITLE)
    public ResponseEntity<ChurchTitleResponse> getBullentinTitle(@PathVariable String churchId) {
        return ResponseEntity.ok(churchFacade.getBullentinTitle(churchId));
    }
}
