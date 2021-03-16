package com.eomcs.pms.listener;

import java.util.Map;
import com.eomcs.pms.context.ApplicationContextListener;

public class AppListener implements ApplicationContextListener{

  @Override
  public void contextInitialized(Map<String,Object> context) {
    System.out.println("미니 프로젝트 시작");

  }

  @Override
  public void contextDestroyed(Map<String,Object> context) {
    System.out.println("미니 프로젝트 종료");

  }

}
