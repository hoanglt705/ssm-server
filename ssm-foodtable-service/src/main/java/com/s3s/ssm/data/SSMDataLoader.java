/*
 * SSMDataLoader
 * 
 * Project: SSM
 * 
 * Copyright 2010 by HBASoft
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of HBASoft. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license
 * agreements you entered into with HBASoft.
 */
package com.s3s.ssm.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.s3s.entity.Area;
import com.s3s.entity.FoodTable;
import com.s3s.ssm.config.ServerContextProvider;
import com.s3s.ssm.repo.foodtable.AreaRepository;
import com.s3s.ssm.repo.foodtable.FoodTableRepository;

public class SSMDataLoader {
  @SuppressWarnings("deprecation")
  private final static AnnotationConfigApplicationContext applicationContext = ServerContextProvider
          .getInstance().getApplicationContext();
  private static Log logger = LogFactory.getLog(SSMDataLoader.class);

  private static final String INACTIVE_AREA = "INACTIVE_AREA";

  public static final String TANG2 = "Tang 2";

  public static final String TANG1 = "Tang 1";

  private static List<Area> areas;

  public static FoodTable foodTable_01;

  public static FoodTable foodTable_02;

  public static FoodTable foodTable_03;

  private static Area inActiveArea;

  private static FoodTable foodTable_04;

  private static FoodTable foodTable_05;

  private static FoodTable foodTable_06;

  private static FoodTable foodTable_07;

  private static FoodTable foodTable_08;

  private static FoodTable foodTable_09;
  
  private static Properties prop;

  static {
    try (InputStream resourceAsStream = SSMDataLoader.class.getClassLoader().getResourceAsStream(
            "testdata/data.properties");
            InputStreamReader isr = new InputStreamReader(resourceAsStream, "UTF-8");) {
      prop = new Properties();
      prop.load(isr);
    } catch (IOException e) {
    	logger.error(e.getMessage(), e);
    }
  }

  public static void main(String[] args) {
    // Not find solution to get class path from ssm-core.
    DOMConfigurator.configure("src/main/resources/log4j.xml");
    logger.info("Starting data loader SSM...");
    Locale.setDefault(new Locale("vi"));
    try {
      logger.info("Cleaning data SSM");
      cleanDatabase();

      logger.info("Initializing data SSM");
      initDatabase();

      logger.info("Finished data loader SSM");
      System.exit(0);
    } catch (Exception e) {
      logger.error("Error when init data, please check and clean test data", e);
      System.exit(0);
    }
  }

  public static void cleanDatabase() {
    cleanCatalogModule();
    cleanConfigModule();
  }

  private static void cleanConfigModule() {
    applicationContext.getBean(AreaRepository.class).deleteAll();
  }

  private static void cleanCatalogModule() {
    applicationContext.getBean(FoodTableRepository.class).deleteAll();
  }


  public static void initDatabase() {
    initBasicData();
  }

  public static void initBasicData() {
    areas = initArea();
    initFoodTable(areas);
  }

  public static List<FoodTable> initFoodTable(List<Area> areas) {
    String tableName = prop.getProperty("lbl.table") + " ";
    List<FoodTable> results = new ArrayList<FoodTable>();
    for (int i = 0; i < areas.size() - 1; i++) {
      foodTable_01 = new FoodTable();
      foodTable_01.setCode(i + "_01");
      foodTable_01.setName(tableName + i + "_01");
      foodTable_01.setArea(areas.get(i));
      foodTable_01.setSeatNum(4);
      applicationContext.getBean(FoodTableRepository.class).save(foodTable_01);

      foodTable_02 = new FoodTable();
      foodTable_02.setCode(i + "_02");
      foodTable_02.setName(tableName + i + "_02");
      foodTable_02.setArea(areas.get(i));
      foodTable_02.setSeatNum(4);
      applicationContext.getBean(FoodTableRepository.class).save(foodTable_02);

      foodTable_03 = new FoodTable();
      foodTable_03.setCode(i + "_03");
      foodTable_03.setName(tableName + i + "_03");
      foodTable_03.setArea(areas.get(i));
      foodTable_03.setSeatNum(4);
      applicationContext.getBean(FoodTableRepository.class).save(foodTable_03);

      foodTable_04 = new FoodTable();
      foodTable_04.setCode(i + "_04");
      foodTable_04.setName(tableName + i + "_04");
      foodTable_04.setArea(areas.get(i));
      foodTable_04.setSeatNum(4);
      applicationContext.getBean(FoodTableRepository.class).save(foodTable_04);

      foodTable_05 = new FoodTable();
      foodTable_05.setCode(i + "_05");
      foodTable_05.setName(tableName + i + "_05");
      foodTable_05.setArea(areas.get(i));
      foodTable_05.setSeatNum(4);
      applicationContext.getBean(FoodTableRepository.class).save(foodTable_05);

      foodTable_06 = new FoodTable();
      foodTable_06.setCode(i + "_06");
      foodTable_06.setName(tableName + i + "_06");
      foodTable_06.setArea(areas.get(i));
      foodTable_06.setSeatNum(4);
      applicationContext.getBean(FoodTableRepository.class).save(foodTable_06);

      foodTable_07 = new FoodTable();
      foodTable_07.setCode(i + "_07");
      foodTable_07.setName(tableName + i + "_07");
      foodTable_07.setArea(areas.get(i));
      foodTable_07.setSeatNum(4);
      applicationContext.getBean(FoodTableRepository.class).save(foodTable_07);

      foodTable_08 = new FoodTable();
      foodTable_08.setCode(i + "_08");
      foodTable_08.setName(tableName + i + "_08");
      foodTable_08.setArea(areas.get(i));
      foodTable_08.setSeatNum(4);
      applicationContext.getBean(FoodTableRepository.class).save(foodTable_08);

      foodTable_09 = new FoodTable();
      foodTable_09.setCode(i + "_09");
      foodTable_09.setName(tableName + i + "_09");
      foodTable_09.setArea(areas.get(i));
      foodTable_09.setSeatNum(4);
      applicationContext.getBean(FoodTableRepository.class).save(foodTable_09);

      results.add(foodTable_01);
      results.add(foodTable_02);
      results.add(foodTable_03);
      results.add(foodTable_04);
      results.add(foodTable_05);
      results.add(foodTable_06);
      results.add(foodTable_07);
      results.add(foodTable_08);
      results.add(foodTable_09);
    }
    FoodTable foodTable_01 = new FoodTable();
    foodTable_01.setCode("9_01");
    foodTable_01.setName(tableName + "9_01");
    foodTable_01.setArea(inActiveArea);
    foodTable_01.setActive(false);
    foodTable_01.setSeatNum(4);
    applicationContext.getBean(FoodTableRepository.class).save(foodTable_01);

    FoodTable foodTable_02 = new FoodTable();
    foodTable_02.setCode("9_02");
    foodTable_02.setName(tableName + "9_02");
    foodTable_02.setArea(inActiveArea);
    foodTable_02.setActive(false);
    foodTable_02.setSeatNum(4);
    applicationContext.getBean(FoodTableRepository.class).save(foodTable_02);

    FoodTable foodTable_03 = new FoodTable();
    foodTable_03.setCode("9_03");
    foodTable_03.setName(tableName + "9_03");
    foodTable_03.setArea(inActiveArea);
    foodTable_03.setActive(false);
    foodTable_03.setSeatNum(4);
    applicationContext.getBean(FoodTableRepository.class).save(foodTable_03);

    results.add(foodTable_01);
    results.add(foodTable_02);
    results.add(foodTable_03);
    return results;
  }

  public static List<Area> initArea() {
    String areaName = prop.getProperty("lbl.area");
    String flatRoofName = prop.getProperty("lbl.area.flat_roof");
    List<Area> areas = new ArrayList<>();
    for (int i = 1; i < 7; i++) {
      Area area = new Area();
      area.setCode("T" + i);
      area.setName(areaName + " " + i);
      areas.add(area);
    }

    Area area7 = new Area();
    area7.setCode("T8");
    area7.setName(flatRoofName);
    areas.add(area7);

    inActiveArea = new Area();
    inActiveArea.setCode(INACTIVE_AREA);
    inActiveArea.setName(INACTIVE_AREA);
    inActiveArea.setActive(false);
    areas.add(inActiveArea);
    applicationContext.getBean(AreaRepository.class).save(areas);
    return areas;
  }
}