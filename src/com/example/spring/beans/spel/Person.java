package com.example.spring.beans.spel;


public class Person {
	
		private String name;
         private Car car;
         //����address������city
         private String city;
         //
         private String info;
         //����car��priceȷ��info��car��price>300000 ����
         //����Ϊ����
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Car getCar() {
			return car;
		}
		public void setCar(Car car) {
			this.car = car;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getInfo() {
			return info;
		}
		public void setInfo(String info) {
			this.info = info;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", car=" + car + ", city=" + city + ", info=" + info + "]";
		}
		 
}
