package com.project.Notice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.Notice.dto.Notice_Table;
import com.project.Notice.service.NoticeService;
@RestController
@CrossOrigin (origins="*",allowedHeaders="*")
public class NoticeController {

    @Autowired
    private NoticeService service;

    @RequestMapping(value = "/notice", method = RequestMethod.POST)
    @ResponseBody
    public List<Notice_Table> GNotice(@RequestBody Notice_Table notice) {
        System.out.println(notice.getStudent_class() + " " + notice.getDate_to()+ " " + notice.getNotice_id());
        System.out.println(notice);
        return service.GlobalNotice(notice.getDate_to());
    }

    @RequestMapping(value = "/notice/class", method = RequestMethod.POST)
    @ResponseBody
    public List<Notice_Table> CNotice(@RequestBody Notice_Table notice) {
        System.out.println(notice.getStudent_class() + " " + notice.getDate_to()+ " " + notice.getNotice_id());
        System.out.println(notice);
        return service.ClassNotice(notice.getStudent_class(),notice.getDate_to());
    }

        @RequestMapping(value = "getAllNotice", method = RequestMethod.GET)
    public List<Notice_Table> GNotice() {
        return service.AllNotice();
    }



    @PostMapping(value = "AddNotice")
    public void addNotice(Notice_Table nt){
         service.addNotice(nt);
    }

}
