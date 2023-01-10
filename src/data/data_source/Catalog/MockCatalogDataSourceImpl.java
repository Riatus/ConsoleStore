package data.data_source.Catalog;

import data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSourceImpl extends CatalogDataSource{
    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("id1","SmartPhone","best phone", 1000,true));
        products.add(new Product("id2","Laptop","best Laptop", 3000,true));
        products.add(new Product("id3","Smart Watch","best Watch", 2000,true));
        products.add(new Product("id4","Phone","best phone", 100,true));
        return products;
    }
}
