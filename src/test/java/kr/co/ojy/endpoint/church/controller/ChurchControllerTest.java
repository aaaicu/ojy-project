package kr.co.ojy.endpoint.church.controller;

import com.epages.restdocs.apispec.ResourceSnippetParameters;
import kr.co.ojy.common.constant.Endpoint;
import kr.co.ojy.common.constant.path.Church;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.restdocs.operation.preprocess.OperationRequestPreprocessor;
import org.springframework.restdocs.operation.preprocess.OperationResponsePreprocessor;
import org.springframework.restdocs.operation.preprocess.Preprocessors;
import org.springframework.restdocs.payload.FieldDescriptor;
import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.restdocs.request.ParameterDescriptor;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static com.epages.restdocs.apispec.ResourceDocumentation.resource;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.modifyUris;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureRestDocs
@ExtendWith({RestDocumentationExtension.class, SpringExtension.class})
class ChurchControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("교회 정보 조회")
    void getBullentinTitle() throws Exception {
        String path = Endpoint.CHURCH + Church.CHURCH_TITLE;
        mockMvc.perform(get(path, "1"))
                .andExpect(status().isOk())
                .andDo(document("church" + Church.CHURCH_TITLE,
                        resource(ResourceSnippetParameters.builder()
                                .tag("church")
                                .summary("교회 데이터 요청")
                                .description("교회 ID를 받아서 주보 상단에 보여줄 타이틀 반환")
                                .pathParameters(userIdPathParameter())
                                .responseFields(getResponseFields())
                                .build())
                ))
                .andDo(print());
    }



//    mockMvc.perform(get("/carts/{id}", cartId)
//  .accept(HAL_JSON))
//            .andExpect(status().isOk())
//            .andDo(document("cart-get",
//                   resource(ResourceSnippetParameters.builder()
//      .description("Get a cart by id")
//      .pathParameters(
//            parameterWithName("id").description("the cart id"))
//            .responseFields(
//            fieldWithPath("total").description("Total amount of the cart."),
//    fieldWithPath("products").description("The product line item of the cart."),
//    subsectionWithPath("products[]._links.product").description("Link to the product."),
//    fieldWithPath("products[].quantity").description("The quantity of the line item."),
//    subsectionWithPath("products[].product").description("The product the line item relates to."),
//    subsectionWithPath("_links").description("Links section."))
//            .links(
//            linkWithRel("self").ignored(),
//    linkWithRel("order").description("Link to order the cart."))
//            .build())));

    private List<FieldDescriptor> getResponseFields() {
        return List.of(
                fieldWithPath("churchTitle").type(JsonFieldType.STRING).description(""),
                fieldWithPath("motto").type(JsonFieldType.STRING).description("")
        );
    }

    private ParameterDescriptor userIdPathParameter() {
        return parameterWithName("churchId").description("교회 식별 ID");
    }

    private OperationResponsePreprocessor getDocumentResponse() {
        return Preprocessors.preprocessResponse(prettyPrint());
    }

    private OperationRequestPreprocessor getDocumentRequest() {
        return Preprocessors.preprocessRequest(
                modifyUris()
                        .scheme("https")
                        .host("church.yummy-things.xyz")
                        .removePort(),
                prettyPrint()
        );
    }
}

