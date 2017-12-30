/*
 * Copyright 2012-2013 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.s3s.ssm.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.s3s.ssm.dto.LatestInvoiceDto;
import com.s3s.ssm.dto.PaymentDto;
import com.s3s.ssm.service.IDashboardService;

@Component("dashboardService")
class DashboardServiceImpl implements IDashboardService {
//  @Autowired
//  private IInvoiceService invoiceService;
//  @Autowired
//  private IFoodTableService foodTableService;
//  @Autowired
//  private IPaymentService paymentService;
  
  @Override
  public List<PaymentDto> getLatestPayment(int size) {
//	return paymentService.getLatestPayment(size);
	  return Collections.emptyList();
  }

  @Override
  public long[] getOperatingTable() {
//    long[] tableCount = new long[3];
//    long waitingCount = invoiceService.countInvoice(InvoiceStatus.BOOKING);
//    long servingCount = invoiceService.countInvoice(InvoiceStatus.SERVING);
//    long existingCount = foodTableService.countByActive();
//
//    tableCount[0] = waitingCount;
//    tableCount[1] = servingCount;
//    tableCount[2] = existingCount - (waitingCount + servingCount);
//    return tableCount;
	  
	  return null;
  }

  @Override
  public List<LatestInvoiceDto> getLatestInvoice(int size) {
//    return invoiceService.getLatestInvoice(InvoiceStatus.PAID, size);
	  return Collections.emptyList();
  }
}
