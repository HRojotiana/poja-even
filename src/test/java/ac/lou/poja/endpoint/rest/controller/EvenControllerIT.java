package ac.lou.poja.endpoint.rest.controller;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ac.lou.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EvenControllerIT extends FacadeIT {
    @Autowired EvenController evenController;
    @Test
    void getEven() {
        int evenResult = evenController.getEven();
        assertTrue(evenResult % 2 == 0);
    }
}
