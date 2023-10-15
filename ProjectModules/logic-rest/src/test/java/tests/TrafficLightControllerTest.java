package tests;

import interfaces.TrafficLightsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(TrafficLightControllerTest.class)
public class TrafficLightControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private TrafficLightsService trafficLightsService;

    @Test
    public void testSwitchToRed() throws Exception {
        mockMvc.perform(post("/switch-red")).andExpect(status().isOk());
    }
}
