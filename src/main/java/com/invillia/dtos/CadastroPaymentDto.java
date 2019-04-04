package com.invillia.dtos;

import java.util.Optional;

public class CadastroPaymentDto {

	private Optional<Long> id = Optional.empty();
	private String paymentstatus;
	private String numCredito;
	private Long orderId;
	
	public Optional<Long> getId() {
		return id;
	}
	public void setId(Optional<Long> id) {
		this.id = id;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	
	public String getNumCredito() {
		return numCredito;
	}
	public void setNumCredito(String numCredito) {
		this.numCredito = numCredito;
	}
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "CadastroPaymentDto [id=" + id + ", paymentstatus=" + paymentstatus + ", numCredito=" + numCredito
				+ ", orderId=" + orderId + "]";
	}
	
	
}
