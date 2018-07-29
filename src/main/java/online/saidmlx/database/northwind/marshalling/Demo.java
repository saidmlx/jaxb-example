package online.saidmlx.database.northwind.marshalling;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import online.saidmlx.database.northwind.products.Categories;
import online.saidmlx.database.northwind.products.Products;



public class Demo {

	public static void main(String[] args) {
		try {
			
			JAXBContext context= JAXBContext.newInstance(Products.class);
			
			Marshaller marshaler = context.createMarshaller();

			Products products = new Products();
			products.setProductId(1);
			products.setProductName("Chai");
			products.setSupplierId(8);
			products.setCategory(new Categories());
			products.getCategory().setCategoryId(1);
			products.getCategory().setCategoryName("Beverages");
			products.getCategory().setDescription("Soft drinks, coffees, teas, beers, and ales");
			products.setQuantityPerUnit("10 boxes x 30 bags");
			products.setUnitPrice(18);
			products.setUnitsInStock(39);
			products.setUnitsOnOrder(0);
			products.setReorderLevel(10);
			products.setDiscontinued(1);
			
			
			StringWriter writer = new StringWriter();
			marshaler.marshal(products, writer);
			
			System.out.println(writer.toString());
			
			Unmarshaller unmarshaler = context.createUnmarshaller();
			
			Products productsResult = (Products)unmarshaler.unmarshal(new StringReader(writer.toString()));
			
			System.out.print(productsResult.getProductName());
			
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
