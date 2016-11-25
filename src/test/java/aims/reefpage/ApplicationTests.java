package aims.reefpage;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by gcoleman on 14/10/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    private Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void fishByYear() throws Exception {
        mockMvc.perform(
                get("/fishByYears/search/findByFullreefId?reefid={reefid}", "19209S")
                        .header("Origin", "test")
        )
                .andExpect(
                        status().isOk())
                .andExpect(
                        jsonPath("$._embedded.fishByYears[0].reefName").value(
                                "REBE REEF"))
                .andExpect(header().string("Access-Control-Allow-Origin", "test"))
                .andReturn();
    }

    @Test
    public void fishByDecade() throws Exception {
        mockMvc.perform(
                get("/fishByDecades/search/findByFullreefId?reefid={reefid}", "19209S")).andExpect(
                status().isOk()).andExpect(
                jsonPath("$._embedded.fishByDecades[0].reefName").value(
                        "REBE REEF"));
    }


    @Test
    public void mantaByYear() throws Exception {
        mockMvc.perform(
                get("/mantaByYears/search/findByFullreefId?reefid={reefid}", "19209S")).andExpect(
                status().isOk()).andExpect(
                jsonPath("$._embedded.mantaByYears[0].reefName").value(
                        "REBE REEF"));
    }

    @Test
    public void mantaByDecade() throws Exception {
        mockMvc.perform(
                get("/mantaByDecades/search/findByFullreefId?reefid={reefid}", "19209S")).andExpect(
                status().isOk()).andExpect(
                jsonPath("$._embedded.mantaByDecades[0].reefName").value(
                        "REBE REEF"));
    }

    @Test
    @Ignore
    public void benthicGroupByYear() throws Exception {
        mockMvc.perform(
                get("/benthicGroupByYears/search/findByFullreefId?reefid={reefid}", "19209S")).andExpect(
                status().isOk()).andExpect(
                jsonPath("$._embedded.benthicGroupByYears[0].reefName").value(
                        "REBE REEF"));
    }

    @Test
    @Ignore
    public void benthicGroupByDecade() throws Exception {
        mockMvc.perform(
                get("/benthicGroupByDecades/search/findByFullreefId?reefid={reefid}", "19209S")).andExpect(
                status().isOk()).andExpect(
                jsonPath("$._embedded.benthicGroupByDecades[0].reefName").value(
                        "REBE REEF"));
    }

    @Test
    public void juvenileCoralByYear() throws Exception {
        mockMvc.perform(
                get("/juvenileCoralByYears/search/findByFullreefId?reefid={reefid}", "19209S")).andExpect(
                status().isOk()).andExpect(
                jsonPath("$._embedded.juvenileCoralByYears[0].reefName").value(
                        "REBE REEF"));
    }

    @Test
    public void juvenileCoralByDecade() throws Exception {
        mockMvc.perform(
                get("/juvenileCoralByDecades/search/findByFullreefId?reefid={reefid}", "19209S")).andExpect(
                status().isOk()).andExpect(
                jsonPath("$._embedded.juvenileCoralByDecades[0].reefName").value(
                        "REBE REEF"));
    }


    @Test
    public void photos() throws Exception {
        mockMvc.perform(
                get("/photos/search/findByFullreefIdAndReefZoneCode?reefid={reefid}&zone={zone}", "19209S", "1")).andExpect(
                status().isOk()).andExpect(
                jsonPath("$._embedded.photos[0].fullreefId").value(
                        "19209S"));
    }

    @Test
    public void reefComment() throws Exception {
        final ResultActions resultActions = mockMvc.perform(
                get("/reefComments/{reefid}", "19209S"));
        log.info(resultActions.andReturn().getResponse().getContentAsString());
        resultActions.andExpect(
                status().isOk()).andExpect(
                jsonPath("$.reefName").value(
                        "REBE REEF"));
    }

}
