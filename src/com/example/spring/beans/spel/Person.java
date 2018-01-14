package com.example.spring.beans.spel;


public class Person {
	
		private String name;
         private Car car;
         //引用address的属性city
         private String city;
         //
         private String info;
         //根据car的price确定info：car的price>300000 金领
         //否则为白领
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
