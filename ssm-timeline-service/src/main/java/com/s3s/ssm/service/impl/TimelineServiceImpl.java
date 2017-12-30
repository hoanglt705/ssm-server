package com.s3s.ssm.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.s3s.ssm.dto.InvoiceDto;
import com.s3s.ssm.service.ITimelineService;

@Component("timelineService")
public class TimelineServiceImpl implements ITimelineService {

  @Override
  public List<InvoiceDto> getInvoice(Date fromDate, Date toDate) {
//    QInvoice qInvoice = QInvoice.invoice;
//    BooleanExpression expression = qInvoice.createdDate.goe(fromDate).and(qInvoice.createdDate.loe(toDate));
//
//    List<Invoice> list = new JPAQuery(entityManager)
//            .from(qInvoice)
//            .where(expression)
//            .list(qInvoice);
//
//    List<InvoiceDto> invoiceDtos = new ArrayList<>();
//    for (Invoice invoice : list) {
//      InvoiceDto dto = new InvoiceDto();
//      dto.setCode(invoice.getCode());
//      dto.setCreatedDate(invoice.getCreatedDate());
//      FoodTable foodTable = invoice.getFoodTable();
//      if (foodTable != null) {
//        dto.setFoodTable(new FoodTableDto(foodTable.getCode(), foodTable.getName()));
//      }
//      dto.setInvoiceStatus(invoice.getInvoiceStatus());
//      dto.setEndedDate(invoice.getEndedDate());
//      List<InvoiceDetailDto> detailDtos = new ArrayList<>();
//      for (InvoiceDetail detail : invoice.getInvoiceDetails()) {
//        InvoiceDetailDto detailDto = new InvoiceDetailDto();
//        ProductDto productDto = new ProductDto();
//        productDto.setName(detail.getProduct().getName());
//        detailDto.setProduct(productDto);
//        detailDto.setAmount(detail.getAmount());
//        detailDtos.add(detailDto);
//      }
//      dto.setInvoiceDetails(detailDtos);
//      invoiceDtos.add(dto);
//    }
//
//    return invoiceDtos;
	  return Collections.emptyList();
  }
}
