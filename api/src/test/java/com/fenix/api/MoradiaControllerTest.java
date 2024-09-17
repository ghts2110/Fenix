package com.fenix.api;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fenix.api.ApiApplication;
import com.fenix.api.controller.MoradiaController;
import com.fenix.api.models.Artigo;
import com.fenix.api.models.CategCnh;
import com.fenix.api.models.ExpProf;
import com.fenix.api.models.IddFilhos;
import com.fenix.api.models.MoradiaModel;
import com.fenix.api.models.QDef;
import com.fenix.api.models.TeDjesfsa;
import com.fenix.api.models.Telefone;
import com.fenix.api.services.MoradiaService;

// @SpringBootTest(classes = ApiApplication.class)
 @WebMvcTest(MoradiaController.class)
public class MoradiaControllerTest {
    private static final String END_POINT_PATH = "/moradias";
    @Autowired private MockMvc mockMvc;
    @Autowired private ObjectMapper objectMapper;
    @MockBean private MoradiaService service;

    private Telefone telefone = new Telefone(1, "988873456");


    private TeDjesfsa teDjesfsa = new TeDjesfsa();

    @Test
    public void testAddInvalidValueEndr() throws Exception{
        teDjesfsa.setCadastro(1);
        MoradiaModel moradia = new MoradiaModel("", END_POINT_PATH, END_POINT_PATH, END_POINT_PATH, END_POINT_PATH, telefone, teDjesfsa);
        String reqBody = objectMapper.writeValueAsString(moradia);
        mockMvc.perform(post(END_POINT_PATH)
        .contentType("application/json")
        .content(reqBody))
        .andExpect(status().isBadRequest());
    }
    @Test
    public void testAddInvalidValueBairro(){

    }

    @Test
    public void testAddInvalidValueCidade(){

    }

    @Test
    public void testAddInvalidValueEst(){

    }

    @Test
    public void testAddInvalidValueCep(){

    }

    @Test
    public void testAddInvalidValueTel(){

    }

    @Test
    public void testAddInvalidValueTeDjesfsa(){

    }
}
