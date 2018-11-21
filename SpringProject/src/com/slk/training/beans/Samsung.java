package com.slk.training.beans;

public class Samsung {
	
	private Processor processor;
	private String model;
	private double cost;
	
	public Samsung(String model,double cost,Processor processor)
	{
		super();
		this.cost=cost;
		this.model=model;
		this.processor=processor;
	}



	/*public Samsung(Processor processor)
	{
		this.processor=processor;
	}*/
	
	
	
	@Override
	public String toString() {
		return "Samsung [processor=" + processor + ", model=" + model + ", cost=" + cost + "]";
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public Processor getProcessor() {
		return processor;
	}



	public void movie()
	{
		System.out.println("Movie started");
		processor.process();
	}
	
	public void setProcessor(Processor processor){
		this.processor=processor;
	}

}
