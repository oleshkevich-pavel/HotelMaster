/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmaster.rooms.directory;

import hotelmaster.Room;
import hotelmaster.rooms.RoomDAO;
import java.util.List;
import javax.naming.directory.SearchResult;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author GEORGE
 */

@Controller
public class DirectoryController {
    
    @Autowired
    private RoomDAO roomDAO;
    
    @RequestMapping(value="/rooms", method = RequestMethod.GET)
    public ModelAndView showRoomsDirectory(){
        ModelAndView modelAndView = new ModelAndView("rooms");
        //ContactForm cf = new ContactForm();
       // modelAndView.addObject("contactForm", cf);
       
        List<Room> roomList = roomDAO.list();
        modelAndView.addObject("roomList", roomList);
        Room room = new Room();
        modelAndView.addObject("room", room);
        modelAndView.setViewName("rooms");
        
        return modelAndView;
        
    }
    
    @RequestMapping(value="/processParams", method = RequestMethod.POST)
    public ModelAndView processParams(@ModelAttribute("searchParams") @Valid SearchResult searchParams,  BindingResult result, HttpServletRequest htrequest, Errors errors) {
        ModelAndView modelAndView = new ModelAndView("rooms");
       
        List<Room> roomList = roomDAO.list();
        modelAndView.addObject("roomList", roomList);
        
        modelAndView.setViewName("rooms");
        
        return modelAndView;
        
    }
}
