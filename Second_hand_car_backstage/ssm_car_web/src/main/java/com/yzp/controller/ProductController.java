package com.yzp.controller;

import com.github.pagehelper.PageInfo;
import com.yzp.domain.Car;
import com.yzp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 二手车模板 （展示,卖家，买家信息）
 */
@Controller
@RequestMapping("/car")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 查找基本信息
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = false,defaultValue = "0") int page,
                                @RequestParam(name = "size",required = false,defaultValue = "5") int size){
        ModelAndView mv = new ModelAndView();
        List<Car> carList = productService.findAll(page, size);
//        PageInfo pageInfo = new PageInfo(carList);
        mv.addObject("carList",carList);
        mv.setViewName("car-list");
        System.out.println("11111111");
        return mv;
    }

    /**
     * 查找产品车的详细信息
     */
    @RequestMapping("/findOne.do")
    public ModelAndView findOne(@RequestParam (name = "id")String cid){
        ModelAndView mv = new ModelAndView();
        Car car = productService.findOne(cid);
        mv.addObject("car",car);
        mv.setViewName("car-show");
        return mv;
    }

    /**
     * 修改基本car信息
     * @param car
     * @return
     */
    @RequestMapping("/updateOne.do")
    public String update(Car car){
        productService.updateOne(car);
        return "redirect:findAll.do";
    }

    /**
     * 添加详细car信息
     */
    @RequestMapping("/addOne.do")
    public String insert(Car car){
        productService.insertOne(car);
        return "redirect:findAll.do";
    }
}
