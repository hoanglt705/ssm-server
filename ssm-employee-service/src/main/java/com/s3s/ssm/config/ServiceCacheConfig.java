package com.s3s.ssm.config;

import net.sf.ehcache.config.CacheConfiguration;
import net.sf.ehcache.store.MemoryStoreEvictionPolicy;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleCacheErrorHandler;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class ServiceCacheConfig implements CachingConfigurer {

  public net.sf.ehcache.CacheManager ehCacheManager() {
    net.sf.ehcache.config.Configuration config = new net.sf.ehcache.config.Configuration();

    CacheConfiguration areaCacheConfig = new CacheConfiguration();
    areaCacheConfig.setName("areaCache");
    areaCacheConfig.setMemoryStoreEvictionPolicyFromObject(MemoryStoreEvictionPolicy.LFU);
    areaCacheConfig.setMaxEntriesLocalHeap(100);
    config.addCache(areaCacheConfig);

    CacheConfiguration foodTableSameAreaCacheConfig = new CacheConfiguration();
    foodTableSameAreaCacheConfig.setName("foodTableSameAreaCache");
    foodTableSameAreaCacheConfig.setMemoryStoreEvictionPolicyFromObject(MemoryStoreEvictionPolicy.LFU);
    foodTableSameAreaCacheConfig.setMaxEntriesLocalHeap(100);
    config.addCache(foodTableSameAreaCacheConfig);

    CacheConfiguration foodTableCacheConfig = new CacheConfiguration();
    foodTableCacheConfig.setName("foodTableCache");
    foodTableCacheConfig.setMemoryStoreEvictionPolicyFromObject(MemoryStoreEvictionPolicy.LFU);
    foodTableCacheConfig.setMaxEntriesLocalHeap(300);
    config.addCache(foodTableCacheConfig);

    CacheConfiguration findFoodTableCacheConfig = new CacheConfiguration();
    findFoodTableCacheConfig.setName("findFoodTableCache");
    findFoodTableCacheConfig.setMemoryStoreEvictionPolicyFromObject(MemoryStoreEvictionPolicy.LFU);
    findFoodTableCacheConfig.setMaxEntriesLocalHeap(300);
    config.addCache(findFoodTableCacheConfig);

    CacheConfiguration countFoodTableByActiveCacheConfig = new CacheConfiguration();
    countFoodTableByActiveCacheConfig.setName("countFoodTableByActiveCache");
    countFoodTableByActiveCacheConfig.setMemoryStoreEvictionPolicyFromObject(MemoryStoreEvictionPolicy.LFU);
    countFoodTableByActiveCacheConfig.setMaxEntriesLocalHeap(1);
    config.addCache(countFoodTableByActiveCacheConfig);

    return net.sf.ehcache.CacheManager.newInstance(config);
  }

  @Bean(name = "cacheManager")
  @Override
  public CacheManager cacheManager() {
    return new EhCacheCacheManager(ehCacheManager());
  }

  @Override
  public KeyGenerator keyGenerator() {
    return new SimpleKeyGenerator();
  }

  @Override
  public CacheResolver cacheResolver() {
    return null;
  }

  @Override
  public CacheErrorHandler errorHandler() {
    return new SimpleCacheErrorHandler();
  }

}
