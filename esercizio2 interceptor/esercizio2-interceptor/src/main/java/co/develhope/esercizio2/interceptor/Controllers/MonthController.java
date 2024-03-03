package co.develhope.esercizio2.interceptor.Controllers;

import co.develhope.esercizio2.interceptor.Entities.Month;
import co.develhope.esercizio2.interceptor.Repositories.MonthRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping("/get")
    public Month getAMonth(HttpServletRequest request){
        return (Month) request.getAttribute("selectedMonth");
    }
}
