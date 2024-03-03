package co.develhope.esercizio2.interceptor.Interceptors;

import co.develhope.esercizio2.interceptor.Entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Component
public class MonthInterceptor implements HandlerInterceptor {
    private final List<Month> monthList = new ArrayList<>();

    public MonthInterceptor(){
        monthList.add(new Month(1L,1,"January","Gennaio","Januar"));
        monthList.add(new Month(2L,2,"February","Febbraio","Februar"));
        monthList.add(new Month(3L,3,"March","Marzo","März"));
        monthList.add(new Month(4L,4,"April","Aprile","April"));
        monthList.add(new Month(5L,5,"May","Maggio","Mai"));
        monthList.add(new Month(6L,6,"June","Giugno","Juni"));
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumber = request.getHeader("monthNumber");
        if(monthNumber == null || monthNumber.isEmpty()){
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "monthNumber header is required");
            return false;
        }
        for(Month month : monthList){
            if(month.getMonthNumber() == Integer.parseInt(monthNumber)){
                request.setAttribute("selectedMonth", month);
                return true;
            }
        }
        Month emptyMonth = new Month();
        emptyMonth.setEnglishName("nope");
        emptyMonth.setItalianName("nope");
        emptyMonth.setGermanName("nope");
        request.setAttribute("selectedMonth", emptyMonth);
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        response.setStatus(HttpServletResponse.SC_OK);
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
