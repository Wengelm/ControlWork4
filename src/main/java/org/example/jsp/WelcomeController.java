/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.example.jsp;

import java.sql.SQLException;
import java.util.List;

import org.example.jsp.Entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {


    @Autowired
    private OrderService service;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Model model) {


        model.addAttribute("orders", service.orders());

        return "welcome";
    }

    @RequestMapping(value = "/addOrder/", method = RequestMethod.GET)
    public String addOrder(Model model) {


        return "orders_form";
    }

    @RequestMapping(value = "/addNewOrder", method = RequestMethod.POST)
    public String addNewOrder(Model model, @RequestParam("nameorder") String nameorder, @RequestParam("dateorder") String dateorder, @RequestParam("namecustomer") String namecustomer,
							  @RequestParam("status")  String status, @RequestParam("mobile") String mobile, @RequestParam("cost") String cost ) {
        Order order = new Order(nameorder,dateorder,namecustomer,status,cost,mobile);
        service.addOrder(order);
        return "redirect:/";
    }

    @RequestMapping(value="/deleteOrder/{id}", method=RequestMethod.GET)
    public String delete(@PathVariable("id") Long id) {

        service.deleteOrder(id);
        return "redirect:/";

    }
    @RequestMapping(value="/editOrder/{id}", method=RequestMethod.GET)
    public String editOrder(Model model, @PathVariable Long id) {


        Order order = service.getOrderById(id);
        model.addAttribute("order", order);


        return "edit";
    }

    @RequestMapping(value = "/Update", method = RequestMethod.POST)
    public String Гзвфеу(Model model, @ModelAttribute("order") Order o) {

        service.addOrder(o);
        return "redirect:/";
    }

}
