package com.dly.controller;

import com.dly.entity.TCarousel;
import com.dly.service.CarouselService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"carousel"})
public class CarouselController
{

  @Resource
  CarouselService carouselService;

  @PostMapping({"all"})
  public Object getCarousel()
  {
    return this.carouselService.getCarousel();
  }

  @PostMapping({"delete"})
  public Object deleteCarousel(Integer id) {
    return this.carouselService.deleteCarousel(id);
  }

  @PostMapping({"add"})
  public Object addCarousel(TCarousel tCarousel) {
    return this.carouselService.addCarousel(tCarousel);
  }

  @PostMapping({"edit"})
  public Object editCarousel(TCarousel tCarousel) {
    return this.carouselService.editCarousel(tCarousel);
  }
}