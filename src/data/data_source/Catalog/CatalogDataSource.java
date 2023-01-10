package data.data_source.Catalog;

import data.models.Product;

import java.util.ArrayList;

public abstract class CatalogDataSource {
    public abstract ArrayList<Product> getCatalog();
}
