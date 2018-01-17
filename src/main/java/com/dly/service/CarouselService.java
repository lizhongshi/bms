package com.dly.service;

import com.dly.entity.TCarousel;

public abstract interface CarouselService
{
  public abstract Object getCarousel();

  public abstract Object deleteCarousel(Integer paramInteger);

  public abstract Object addCarousel(TCarousel paramTCarousel);

  public abstract Object editCarousel(TCarousel paramTCarousel);
}