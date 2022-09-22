package kr.co.ojy.endpoint.bulletin.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.co.ojy.endpoint.bulletin.data.resposne.BulletinResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "bulletin", description = "주보 정보 API")
@Slf4j
@RestController
@RequestMapping("/bulletin")
@RequiredArgsConstructor
public class BulletinController {

    @Operation(summary = "주보 데이터 요청", description = "예배 ID를 받아서 주보 데이터를 가져옴")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = BulletinResponse.class))),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    @Parameters({
            @Parameter(name = "worshipId", description = "예배 식별 Id", example = "1234")
    })
    @GetMapping("/{worshipId}")
    public ResponseEntity<BulletinResponse> findBulletin(@PathVariable Long worshipId) {
        return ResponseEntity.ok(BulletinResponse.builder().build());
    }
}
