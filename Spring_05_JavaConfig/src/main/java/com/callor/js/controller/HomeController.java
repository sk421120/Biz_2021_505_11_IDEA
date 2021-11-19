package com.callor.js.controller;

import com.callor.js.models.BookVO;
import com.callor.js.repository.BookDao;
import com.callor.js.service.impl.NaverServiceImplV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;


@Controller
public class HomeController {

    private final BookDao bookDao;

    private final NaverServiceImplV1 naverService;

    public HomeController(BookDao bookDao, NaverServiceImplV1 naverService) {
        this.bookDao = bookDao;
        this.naverService = naverService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String home() {
        return "home";
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public List<BookVO> home(String search) throws IOException, URISyntaxException {
        String queryString = naverService.queryURL(search);
        String jsonString = naverService.getJsonString(queryString);

        List<BookVO> bookList = naverService.naverList(queryString);
//        return "query : " + search;
        return bookList;
    }
}
