package sample;

public class Goods {
		
		private int price;
		private String color;
		private String size;
		
		public Goods(int price, String color, String size) {
			super();
			this.price = price;
			this.color = color;
			this.size = size;
		}
		
		public Goods() {
			super();
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		@Override
		public String toString() {
			return "Goods [price=" + price + ", color=" + color + ", size=" + size + "]";
		}
}
